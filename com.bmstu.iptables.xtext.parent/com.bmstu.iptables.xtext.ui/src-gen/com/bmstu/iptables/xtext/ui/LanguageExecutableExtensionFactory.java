/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.ui;

import com.bmstu.iptables.xtext.ui.internal.XtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return XtextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return XtextActivator.getInstance().getInjector(XtextActivator.COM_BMSTU_IPTABLES_XTEXT_LANGUAGE);
	}
	
}
