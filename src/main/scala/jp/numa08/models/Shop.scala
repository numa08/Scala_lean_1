package jp.numa08.models

class Shop(name:String, likly:Int) extends Choosable {
	def weight = likly

	override def toString = name
}