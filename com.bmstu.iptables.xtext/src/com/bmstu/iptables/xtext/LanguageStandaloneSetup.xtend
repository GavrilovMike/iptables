/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LanguageStandaloneSetup extends LanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new LanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}