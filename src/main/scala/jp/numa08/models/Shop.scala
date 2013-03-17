package jp.numa08.models

class Shop(val name:String, likly:Int = 10) extends Choosable {

	def weight() = likly

	def toStr(delimiter: String) =  name + delimiter + likly
}