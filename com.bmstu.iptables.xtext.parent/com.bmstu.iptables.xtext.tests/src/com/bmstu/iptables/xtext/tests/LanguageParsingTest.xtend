/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.tests

import com.bmstu.iptables.xtext.language.Model
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(LanguageInjectorProvider)
class LanguageParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Chain INPUT (policy ACCEPT)
			target prot opt source destination
			ACCEPT "Prot" "Opt" !232.1.1.1/32,2.2.2.2/3 1.2.2.2/3,2.3.3.2/32
		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
