/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/bmstu/iptables/xtext/parser/antlr/internal/InternalLanguage.tokens");
	}
}
