package jp.numa08.models

class Shop(val name:String, plice:Int = 10) extends Choosable {

	def weight() = plice

	def toStr(delimiter: String) =  name + delimiter + plice
}