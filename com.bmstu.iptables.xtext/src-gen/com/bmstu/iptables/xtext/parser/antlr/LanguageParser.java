/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.parser.antlr;

import com.bmstu.iptables.xtext.parser.antlr.internal.InternalLanguageParser;
import com.bmstu.iptables.xtext.services.LanguageGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LanguageParser extends AbstractAntlrParser {

	@Inject
	private LanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLanguageParser createParser(XtextTokenStream stream) {
		return new InternalLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public LanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
