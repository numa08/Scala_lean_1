package jp.numa08.scala_lean

import jp.numa08.models._

class Chooser {
	def choose[A <: Choosable](list:List[A], f:() => Int)={
		
		val sort = (ob1:A, ob2:A) =>  { ob1.weight < ob2.weight}
		val sortedList = list.sortWith(sort)

		val find = (ob:A) => { ob.weight > f()}
		val target = sortedList.find(find)

		target.getOrElse(sortedList.last)
	}
}