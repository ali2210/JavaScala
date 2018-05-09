package com.pirates

import com.pirates.scalajavatest._

 object Main { 
    
        def main(args: Array[String]) {
		println("We're running scala..")
		val service = new Maths
                println(service.Sqr(5));
	}
    }

