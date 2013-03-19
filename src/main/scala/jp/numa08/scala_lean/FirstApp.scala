package jp.numa08.scala_lean

import scala.util.Random
import jp.numa08.models._

object FirstApp extends App {
	val shops = new Shop("ohtoya", 10) :: new Shop("mac", 40) :: new Shop("yoshinoya", 60) :: Nil

	val chooser = new Chooser
	val d = ()=> {
		val rand = new Random
		(rand.nextInt(50) + 1)  + (rand.nextInt(50) + 1)
	}
	
	val shop = chooser.choose(shops, d)
	println(shop.name)
}