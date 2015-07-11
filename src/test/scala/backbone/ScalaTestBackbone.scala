/*
 * Copyright (c) 2015 Mind Eratosthenes Kft.
 * License: AGPL v3
 */
package com.mind_era.backbone {
  

//import utest._

import com.mind_era.backbone._
import scala.scalajs.js._
import org.scalatest._

class ScalaTestBackbone extends FlatSpec with Matchers {
  "Backbone" should "do something" in {
    val obj = new com.mind_era.backbone.Events;
    1 should be (1)
  }
}
}
