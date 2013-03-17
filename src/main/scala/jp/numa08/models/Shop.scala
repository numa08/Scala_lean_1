package jp.numa08.models

class Shop(val name:String, likly:Int = 10) extends Choosable {

	def weight():Int = {
		return likly
	}

	def toStr(delimiter: String):String = {
		return name + delimiter + likly
	}
}