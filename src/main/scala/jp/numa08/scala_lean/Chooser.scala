package jp.numa08.scala_lean

import scala.util.Random
import jp.numa08.models._

class Chooser {
	def choose(list:List[Choosable]):Choosable={
		val sortedList = list.sortWith(_.weight > _.weight)

		val rand = new Random
		val dice = (rand.nextInt(10) + 1) * 10 + (rand.nextInt(10) + 1)//100面ダイスライクに1~100を計算
		
		val target = sortedList.find(_.weight > dice)
		target.getOrElse(sortedList.last)
	}


}