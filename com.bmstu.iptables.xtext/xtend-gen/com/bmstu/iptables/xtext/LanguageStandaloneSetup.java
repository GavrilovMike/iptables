/**
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext;

import com.bmstu.iptables.xtext.LanguageStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class LanguageStandaloneSetup extends LanguageStandaloneSetupGenerated {
  public static void doSetup() {
    new LanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
