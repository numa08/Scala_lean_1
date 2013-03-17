package jp.numa08.scala_lean

import jp.numa08.models._

class Chooser {
	def choose[A <: Choosable](list:List[A], f:() => Int):A={
		//A は Choosableを継承したクラス 
		//引数：Aのリスト
		//f:() => Int Intを返す関数f
		
		val sort = (ob1:A, ob2:A) =>  { ob1.weight < ob2.weight}
		//引数をふたつ取って、Booleanを返す関数
		val sortedList:List[A] = list.sortWith(sort)
		//sort関数を使ってリストのソート

		val find = (ob:A) => { ob.weight > f()}
		//引数を一つとってBooleanを返す関数
		val target:Option[A] = sortedList.find(find)
		//findを使ってソートの中から要素を見つける
		//見つからない場合もあるのでOption

		val retval:A = target match {
			//targetのパターンマッチ
			case Some(x) => x 	//Someなら中の値を取り出す
			case _ => sortedList.last //それ以外はリストの末尾要素を取り出す
		}
		return retval
		// target.getOrElse(sortedList.last)
	}
}