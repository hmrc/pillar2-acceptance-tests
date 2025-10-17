package uk.gov.hmrc.test.ui

/*
 * Copyright 2025 HM Revenue & Customs
 *
 */

import java.io.{File, PrintWriter}
import scala.io.Source

object PageFileConverter {

  def convertFile(inputFile: File, outputDir: File): Unit = {
    println(s"Processing page file: ${inputFile.getName}")
    val input = Source.fromFile(inputFile).getLines().toIndexedSeq

    // Replace driver → Driver.instance safely
    val output = input.zipWithIndex.map { case (line, idx) =>
      if (line.contains("driver")) {
        // skip if it's a match/case usage
        if (line.contains("match") || line.trim.startsWith("case")) {
          println(s"⚠️  [Manual check] ${inputFile.getName}:${idx + 1} -> $line")
          line // leave unchanged
        } else {
          line.replace("driver", "Driver.instance")
        }
      } else line
    }

    val className  = inputFile.getName.stripSuffix(".scala")
    val outputFile = new File(outputDir, className + ".scala")

    val writer = new PrintWriter(outputFile)
    writer.write(output.mkString("\n"))
    writer.close()

    println(s"✅ Converted ${inputFile.getName} → ${outputFile.getName}")
  }

  def convertFolder(inputDir: String, outputDir: String): Unit = {
    val inDir  = new File(inputDir)
    val outDir = new File(outputDir)
    if (!outDir.exists()) outDir.mkdirs()

    inDir.listFiles().filter(_.isFile).foreach { file =>
      if (file.getName.endsWith(".scala")) {
        convertFile(file, outDir)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    if (args.length != 2) {
      println("Usage: PageFileConverter <cucumber_pages_folder> <scalatest_pages_folder>")
      System.exit(1)
    }

    val inputDir  = args(0)
    val outputDir = args(1)

    println(s"Starting page conversion from $inputDir to $outputDir...")
    convertFolder(inputDir, outputDir)
    println("Page conversion finished.")
  }
}
