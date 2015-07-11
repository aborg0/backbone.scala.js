/*
 * Copyright (c) 2015 Mind Eratosthenes Kft.
 * License: AGPL v3
 */
package com.mind_era.backbone {
  

import utest._

import com.mind_era.backbone._

/**
 * Tests Backbone functionality.
 * 
 * @author Gabor Bakos
 * @since 1.0
 */
object TestBackbone extends TestSuite {
  val tests = TestSuite{
    'testEvents {
        val obj = new com.mind_era.backbone.Events;
        obj.on("alert", (eventName: String) => scalajs.js.Dynamic.global.alert("Triggered " + eventName))
    
        obj.trigger("alert", "an event")
    
        val onChange = () => scalajs.js.Dynamic.global.alert("whatever")
        val context: scalajs.js.Any = null
    
        obj.off("change", onChange)
        obj.off("change")
        obj.off(null, onChange)
        obj.off(null, null, context)
        obj.off()
    }
  }
}
}