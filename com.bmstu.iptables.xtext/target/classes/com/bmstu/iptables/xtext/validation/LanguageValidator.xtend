/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.validation

import org.eclipse.xtext.validation.Check
import com.bmstu.iptables.xtext.language.ChainPart
import java.util.List
import java.util.ArrayList
import com.bmstu.iptables.xtext.language.LanguagePackage
import org.eclipse.emf.ecore.EStructuralFeature

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class LanguageValidator extends AbstractLanguageValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					LanguagePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def checkChainParts(ChainPart part) {
		checkIpAddress(part.source, LanguagePackage.Literals.CHAIN_PART__SOURCE);
		checkIpAddress(part.destination, LanguagePackage.Literals.CHAIN_PART__DESTINATION);
	}
	
	def checkIpAddress(String ipAddress, EStructuralFeature feature) {
		var addressParts = removeEmptyParts(ipAddress.split("\\D"));
		if (addressParts.empty) {
			return;
		}
		
		for (addressPart : addressParts) {
			if (Integer.valueOf(addressPart) > 255) {
				error("Address part should be in range 0..255", feature);
			}
		}

		for (var partIndex = 4; partIndex < addressParts.size; partIndex += 5) {
			if (Integer.valueOf(addressParts.get(partIndex)) > 32) {
				error("Address mask should be in range 0..255", feature);
			}
		}		
	}
	
	def List<String> removeEmptyParts(String[] strings) {
		var result = new ArrayList();
		for (string : strings) {
			if (!string.isEmpty) {
				result.add(string);
			}
		}
		
		return result;
	}
}
