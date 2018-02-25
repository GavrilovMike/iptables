/*
 * generated by Xtext 2.12.0
 */
grammar InternalLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package com.bmstu.iptables.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.bmstu.iptables.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.bmstu.iptables.xtext.services.LanguageGrammarAccess;

}

@parser::members {

 	private LanguageGrammarAccess grammarAccess;

    public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected LanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getChainsChainParserRuleCall_0());
			}
			lv_chains_0_0=ruleChain
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"chains",
					lv_chains_0_0,
					"com.bmstu.iptables.xtext.Language.Chain");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleChain
entryRuleChain returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChainRule()); }
	iv_ruleChain=ruleChain
	{ $current=$iv_ruleChain.current; }
	EOF;

// Rule Chain
ruleChain returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Chain'
		{
			newLeafNode(otherlv_0, grammarAccess.getChainAccess().getChainKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChainAccess().getChainTypeChainTypeEnumRuleCall_1_0());
				}
				lv_chainType_1_0=ruleChainType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChainRule());
					}
					set(
						$current,
						"chainType",
						lv_chainType_1_0,
						"com.bmstu.iptables.xtext.Language.ChainType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getChainAccess().getLeftParenthesisKeyword_2());
		}
		otherlv_3='policy'
		{
			newLeafNode(otherlv_3, grammarAccess.getChainAccess().getPolicyKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChainAccess().getPolicyTypePolicyTypeEnumRuleCall_4_0());
				}
				lv_policyType_4_0=rulePolicyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChainRule());
					}
					set(
						$current,
						"policyType",
						lv_policyType_4_0,
						"com.bmstu.iptables.xtext.Language.PolicyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getChainAccess().getRightParenthesisKeyword_5());
		}
		otherlv_6='target'
		{
			newLeafNode(otherlv_6, grammarAccess.getChainAccess().getTargetKeyword_6());
		}
		otherlv_7='prot'
		{
			newLeafNode(otherlv_7, grammarAccess.getChainAccess().getProtKeyword_7());
		}
		otherlv_8='opt'
		{
			newLeafNode(otherlv_8, grammarAccess.getChainAccess().getOptKeyword_8());
		}
		otherlv_9='source'
		{
			newLeafNode(otherlv_9, grammarAccess.getChainAccess().getSourceKeyword_9());
		}
		otherlv_10='destination'
		{
			newLeafNode(otherlv_10, grammarAccess.getChainAccess().getDestinationKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChainAccess().getPartsChainPartParserRuleCall_11_0());
				}
				lv_parts_11_0=ruleChainPart
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChainRule());
					}
					add(
						$current,
						"parts",
						lv_parts_11_0,
						"com.bmstu.iptables.xtext.Language.ChainPart");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleChainPart
entryRuleChainPart returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChainPartRule()); }
	iv_ruleChainPart=ruleChainPart
	{ $current=$iv_ruleChainPart.current; }
	EOF;

// Rule ChainPart
ruleChainPart returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getChainPartAccess().getTargetPolicyTypeEnumRuleCall_0_0());
				}
				lv_target_0_0=rulePolicyType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChainPartRule());
					}
					set(
						$current,
						"target",
						lv_target_0_0,
						"com.bmstu.iptables.xtext.Language.PolicyType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_prot_1_0=RULE_STRING
				{
					newLeafNode(lv_prot_1_0, grammarAccess.getChainPartAccess().getProtSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChainPartRule());
					}
					setWithLastConsumed(
						$current,
						"prot",
						lv_prot_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_opt_2_0=RULE_STRING
				{
					newLeafNode(lv_opt_2_0, grammarAccess.getChainPartAccess().getOptSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChainPartRule());
					}
					setWithLastConsumed(
						$current,
						"opt",
						lv_opt_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				lv_source_3_0=RULE_IP_ADDRESS
				{
					newLeafNode(lv_source_3_0, grammarAccess.getChainPartAccess().getSourceIP_ADDRESSTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChainPartRule());
					}
					setWithLastConsumed(
						$current,
						"source",
						lv_source_3_0,
						"com.bmstu.iptables.xtext.Language.IP_ADDRESS");
				}
			)
		)
		(
			(
				lv_destination_4_0=RULE_IP_ADDRESS
				{
					newLeafNode(lv_destination_4_0, grammarAccess.getChainPartAccess().getDestinationIP_ADDRESSTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getChainPartRule());
					}
					setWithLastConsumed(
						$current,
						"destination",
						lv_destination_4_0,
						"com.bmstu.iptables.xtext.Language.IP_ADDRESS");
				}
			)
		)
	)
;

// Rule ChainType
ruleChainType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='INPUT'
			{
				$current = grammarAccess.getChainTypeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getChainTypeAccess().getINPUTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='OUTPUT'
			{
				$current = grammarAccess.getChainTypeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getChainTypeAccess().getOUTPUTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='FORWARD'
			{
				$current = grammarAccess.getChainTypeAccess().getFORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getChainTypeAccess().getFORWARDEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='PREROUTING'
			{
				$current = grammarAccess.getChainTypeAccess().getPREROUTINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getChainTypeAccess().getPREROUTINGEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='POSTROUTING'
			{
				$current = grammarAccess.getChainTypeAccess().getPOSTROUTINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getChainTypeAccess().getPOSTROUTINGEnumLiteralDeclaration_4());
			}
		)
	)
;

// Rule PolicyType
rulePolicyType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='DROP'
			{
				$current = grammarAccess.getPolicyTypeAccess().getDROPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getPolicyTypeAccess().getDROPEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ACCEPT'
			{
				$current = grammarAccess.getPolicyTypeAccess().getACCEPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getPolicyTypeAccess().getACCEPTEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_IP_ADDRESS : ('anywhere'|'!'? RULE_INT '.' RULE_INT '.' RULE_INT '.' RULE_INT '/' RULE_INT (',' '!'? RULE_INT '.' RULE_INT '.' RULE_INT '.' RULE_INT '/' RULE_INT)*);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;