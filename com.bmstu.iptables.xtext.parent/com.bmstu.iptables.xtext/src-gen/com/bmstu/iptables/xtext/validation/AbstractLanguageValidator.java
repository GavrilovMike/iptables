/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractLanguageValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.bmstu.iptables.xtext.language.LanguagePackage.eINSTANCE);
		return result;
	}
	
}
