package jp.numa08.models

class Shop(val name:String, plice:Int) extends Choosable {

	def weight():Int = {
		return plice
	}

	// def toStr(delimiter: String):String = {
	// 	return name + delimiter + plice
	// }
}