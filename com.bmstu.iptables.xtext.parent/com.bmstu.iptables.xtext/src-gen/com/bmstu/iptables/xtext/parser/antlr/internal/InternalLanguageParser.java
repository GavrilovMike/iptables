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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IP_ADDRESS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Chain'", "'('", "'policy'", "')'", "'target'", "'prot'", "'opt'", "'source'", "'destination'", "'INPUT'", "'OUTPUT'", "'FORWARD'", "'PREROUTING'", "'POSTROUTING'", "'DROP'", "'ACCEPT'"
    };
    public static final int RULE_IP_ADDRESS=5;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLanguage.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalLanguage.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalLanguage.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalLanguage.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLanguage.g:72:1: ruleModel returns [EObject current=null] : ( (lv_chains_0_0= ruleChain ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_chains_0_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:78:2: ( ( (lv_chains_0_0= ruleChain ) )* )
            // InternalLanguage.g:79:2: ( (lv_chains_0_0= ruleChain ) )*
            {
            // InternalLanguage.g:79:2: ( (lv_chains_0_0= ruleChain ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLanguage.g:80:3: (lv_chains_0_0= ruleChain )
            	    {
            	    // InternalLanguage.g:80:3: (lv_chains_0_0= ruleChain )
            	    // InternalLanguage.g:81:4: lv_chains_0_0= ruleChain
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getChainsChainParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_chains_0_0=ruleChain();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"chains",
            	    					lv_chains_0_0,
            	    					"com.bmstu.iptables.xtext.Language.Chain");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleChain"
    // InternalLanguage.g:101:1: entryRuleChain returns [EObject current=null] : iv_ruleChain= ruleChain EOF ;
    public final EObject entryRuleChain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChain = null;


        try {
            // InternalLanguage.g:101:46: (iv_ruleChain= ruleChain EOF )
            // InternalLanguage.g:102:2: iv_ruleChain= ruleChain EOF
            {
             newCompositeNode(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChain=ruleChain();

            state._fsp--;

             current =iv_ruleChain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // InternalLanguage.g:108:1: ruleChain returns [EObject current=null] : (otherlv_0= 'Chain' ( (lv_chainType_1_0= ruleChainType ) ) otherlv_2= '(' otherlv_3= 'policy' ( (lv_policyType_4_0= rulePolicyType ) ) otherlv_5= ')' otherlv_6= 'target' otherlv_7= 'prot' otherlv_8= 'opt' otherlv_9= 'source' otherlv_10= 'destination' ( (lv_parts_11_0= ruleChainPart ) )* ) ;
    public final EObject ruleChain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_chainType_1_0 = null;

        Enumerator lv_policyType_4_0 = null;

        EObject lv_parts_11_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:114:2: ( (otherlv_0= 'Chain' ( (lv_chainType_1_0= ruleChainType ) ) otherlv_2= '(' otherlv_3= 'policy' ( (lv_policyType_4_0= rulePolicyType ) ) otherlv_5= ')' otherlv_6= 'target' otherlv_7= 'prot' otherlv_8= 'opt' otherlv_9= 'source' otherlv_10= 'destination' ( (lv_parts_11_0= ruleChainPart ) )* ) )
            // InternalLanguage.g:115:2: (otherlv_0= 'Chain' ( (lv_chainType_1_0= ruleChainType ) ) otherlv_2= '(' otherlv_3= 'policy' ( (lv_policyType_4_0= rulePolicyType ) ) otherlv_5= ')' otherlv_6= 'target' otherlv_7= 'prot' otherlv_8= 'opt' otherlv_9= 'source' otherlv_10= 'destination' ( (lv_parts_11_0= ruleChainPart ) )* )
            {
            // InternalLanguage.g:115:2: (otherlv_0= 'Chain' ( (lv_chainType_1_0= ruleChainType ) ) otherlv_2= '(' otherlv_3= 'policy' ( (lv_policyType_4_0= rulePolicyType ) ) otherlv_5= ')' otherlv_6= 'target' otherlv_7= 'prot' otherlv_8= 'opt' otherlv_9= 'source' otherlv_10= 'destination' ( (lv_parts_11_0= ruleChainPart ) )* )
            // InternalLanguage.g:116:3: otherlv_0= 'Chain' ( (lv_chainType_1_0= ruleChainType ) ) otherlv_2= '(' otherlv_3= 'policy' ( (lv_policyType_4_0= rulePolicyType ) ) otherlv_5= ')' otherlv_6= 'target' otherlv_7= 'prot' otherlv_8= 'opt' otherlv_9= 'source' otherlv_10= 'destination' ( (lv_parts_11_0= ruleChainPart ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getChainAccess().getChainKeyword_0());
            		
            // InternalLanguage.g:120:3: ( (lv_chainType_1_0= ruleChainType ) )
            // InternalLanguage.g:121:4: (lv_chainType_1_0= ruleChainType )
            {
            // InternalLanguage.g:121:4: (lv_chainType_1_0= ruleChainType )
            // InternalLanguage.g:122:5: lv_chainType_1_0= ruleChainType
            {

            					newCompositeNode(grammarAccess.getChainAccess().getChainTypeChainTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_chainType_1_0=ruleChainType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChainRule());
            					}
            					set(
            						current,
            						"chainType",
            						lv_chainType_1_0,
            						"com.bmstu.iptables.xtext.Language.ChainType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getChainAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getChainAccess().getPolicyKeyword_3());
            		
            // InternalLanguage.g:147:3: ( (lv_policyType_4_0= rulePolicyType ) )
            // InternalLanguage.g:148:4: (lv_policyType_4_0= rulePolicyType )
            {
            // InternalLanguage.g:148:4: (lv_policyType_4_0= rulePolicyType )
            // InternalLanguage.g:149:5: lv_policyType_4_0= rulePolicyType
            {

            					newCompositeNode(grammarAccess.getChainAccess().getPolicyTypePolicyTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_policyType_4_0=rulePolicyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChainRule());
            					}
            					set(
            						current,
            						"policyType",
            						lv_policyType_4_0,
            						"com.bmstu.iptables.xtext.Language.PolicyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getChainAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChainAccess().getTargetKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getChainAccess().getProtKeyword_7());
            		
            otherlv_8=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getChainAccess().getOptKeyword_8());
            		
            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getChainAccess().getSourceKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getChainAccess().getDestinationKeyword_10());
            		
            // InternalLanguage.g:190:3: ( (lv_parts_11_0= ruleChainPart ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=26 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLanguage.g:191:4: (lv_parts_11_0= ruleChainPart )
            	    {
            	    // InternalLanguage.g:191:4: (lv_parts_11_0= ruleChainPart )
            	    // InternalLanguage.g:192:5: lv_parts_11_0= ruleChainPart
            	    {

            	    					newCompositeNode(grammarAccess.getChainAccess().getPartsChainPartParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_parts_11_0=ruleChainPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getChainRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parts",
            	    						lv_parts_11_0,
            	    						"com.bmstu.iptables.xtext.Language.ChainPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRuleChainPart"
    // InternalLanguage.g:213:1: entryRuleChainPart returns [EObject current=null] : iv_ruleChainPart= ruleChainPart EOF ;
    public final EObject entryRuleChainPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChainPart = null;


        try {
            // InternalLanguage.g:213:50: (iv_ruleChainPart= ruleChainPart EOF )
            // InternalLanguage.g:214:2: iv_ruleChainPart= ruleChainPart EOF
            {
             newCompositeNode(grammarAccess.getChainPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChainPart=ruleChainPart();

            state._fsp--;

             current =iv_ruleChainPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChainPart"


    // $ANTLR start "ruleChainPart"
    // InternalLanguage.g:220:1: ruleChainPart returns [EObject current=null] : ( ( (lv_target_0_0= rulePolicyType ) ) ( (lv_prot_1_0= RULE_STRING ) ) ( (lv_opt_2_0= RULE_STRING ) ) ( (lv_source_3_0= RULE_IP_ADDRESS ) ) ( (lv_destination_4_0= RULE_IP_ADDRESS ) ) ) ;
    public final EObject ruleChainPart() throws RecognitionException {
        EObject current = null;

        Token lv_prot_1_0=null;
        Token lv_opt_2_0=null;
        Token lv_source_3_0=null;
        Token lv_destination_4_0=null;
        Enumerator lv_target_0_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:226:2: ( ( ( (lv_target_0_0= rulePolicyType ) ) ( (lv_prot_1_0= RULE_STRING ) ) ( (lv_opt_2_0= RULE_STRING ) ) ( (lv_source_3_0= RULE_IP_ADDRESS ) ) ( (lv_destination_4_0= RULE_IP_ADDRESS ) ) ) )
            // InternalLanguage.g:227:2: ( ( (lv_target_0_0= rulePolicyType ) ) ( (lv_prot_1_0= RULE_STRING ) ) ( (lv_opt_2_0= RULE_STRING ) ) ( (lv_source_3_0= RULE_IP_ADDRESS ) ) ( (lv_destination_4_0= RULE_IP_ADDRESS ) ) )
            {
            // InternalLanguage.g:227:2: ( ( (lv_target_0_0= rulePolicyType ) ) ( (lv_prot_1_0= RULE_STRING ) ) ( (lv_opt_2_0= RULE_STRING ) ) ( (lv_source_3_0= RULE_IP_ADDRESS ) ) ( (lv_destination_4_0= RULE_IP_ADDRESS ) ) )
            // InternalLanguage.g:228:3: ( (lv_target_0_0= rulePolicyType ) ) ( (lv_prot_1_0= RULE_STRING ) ) ( (lv_opt_2_0= RULE_STRING ) ) ( (lv_source_3_0= RULE_IP_ADDRESS ) ) ( (lv_destination_4_0= RULE_IP_ADDRESS ) )
            {
            // InternalLanguage.g:228:3: ( (lv_target_0_0= rulePolicyType ) )
            // InternalLanguage.g:229:4: (lv_target_0_0= rulePolicyType )
            {
            // InternalLanguage.g:229:4: (lv_target_0_0= rulePolicyType )
            // InternalLanguage.g:230:5: lv_target_0_0= rulePolicyType
            {

            					newCompositeNode(grammarAccess.getChainPartAccess().getTargetPolicyTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_target_0_0=rulePolicyType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChainPartRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_0_0,
            						"com.bmstu.iptables.xtext.Language.PolicyType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLanguage.g:247:3: ( (lv_prot_1_0= RULE_STRING ) )
            // InternalLanguage.g:248:4: (lv_prot_1_0= RULE_STRING )
            {
            // InternalLanguage.g:248:4: (lv_prot_1_0= RULE_STRING )
            // InternalLanguage.g:249:5: lv_prot_1_0= RULE_STRING
            {
            lv_prot_1_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_prot_1_0, grammarAccess.getChainPartAccess().getProtSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChainPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prot",
            						lv_prot_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLanguage.g:265:3: ( (lv_opt_2_0= RULE_STRING ) )
            // InternalLanguage.g:266:4: (lv_opt_2_0= RULE_STRING )
            {
            // InternalLanguage.g:266:4: (lv_opt_2_0= RULE_STRING )
            // InternalLanguage.g:267:5: lv_opt_2_0= RULE_STRING
            {
            lv_opt_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_opt_2_0, grammarAccess.getChainPartAccess().getOptSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChainPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"opt",
            						lv_opt_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalLanguage.g:283:3: ( (lv_source_3_0= RULE_IP_ADDRESS ) )
            // InternalLanguage.g:284:4: (lv_source_3_0= RULE_IP_ADDRESS )
            {
            // InternalLanguage.g:284:4: (lv_source_3_0= RULE_IP_ADDRESS )
            // InternalLanguage.g:285:5: lv_source_3_0= RULE_IP_ADDRESS
            {
            lv_source_3_0=(Token)match(input,RULE_IP_ADDRESS,FOLLOW_16); 

            					newLeafNode(lv_source_3_0, grammarAccess.getChainPartAccess().getSourceIP_ADDRESSTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChainPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_3_0,
            						"com.bmstu.iptables.xtext.Language.IP_ADDRESS");
            				

            }


            }

            // InternalLanguage.g:301:3: ( (lv_destination_4_0= RULE_IP_ADDRESS ) )
            // InternalLanguage.g:302:4: (lv_destination_4_0= RULE_IP_ADDRESS )
            {
            // InternalLanguage.g:302:4: (lv_destination_4_0= RULE_IP_ADDRESS )
            // InternalLanguage.g:303:5: lv_destination_4_0= RULE_IP_ADDRESS
            {
            lv_destination_4_0=(Token)match(input,RULE_IP_ADDRESS,FOLLOW_2); 

            					newLeafNode(lv_destination_4_0, grammarAccess.getChainPartAccess().getDestinationIP_ADDRESSTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChainPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destination",
            						lv_destination_4_0,
            						"com.bmstu.iptables.xtext.Language.IP_ADDRESS");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChainPart"


    // $ANTLR start "ruleChainType"
    // InternalLanguage.g:323:1: ruleChainType returns [Enumerator current=null] : ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) | (enumLiteral_2= 'FORWARD' ) | (enumLiteral_3= 'PREROUTING' ) | (enumLiteral_4= 'POSTROUTING' ) ) ;
    public final Enumerator ruleChainType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLanguage.g:329:2: ( ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) | (enumLiteral_2= 'FORWARD' ) | (enumLiteral_3= 'PREROUTING' ) | (enumLiteral_4= 'POSTROUTING' ) ) )
            // InternalLanguage.g:330:2: ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) | (enumLiteral_2= 'FORWARD' ) | (enumLiteral_3= 'PREROUTING' ) | (enumLiteral_4= 'POSTROUTING' ) )
            {
            // InternalLanguage.g:330:2: ( (enumLiteral_0= 'INPUT' ) | (enumLiteral_1= 'OUTPUT' ) | (enumLiteral_2= 'FORWARD' ) | (enumLiteral_3= 'PREROUTING' ) | (enumLiteral_4= 'POSTROUTING' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLanguage.g:331:3: (enumLiteral_0= 'INPUT' )
                    {
                    // InternalLanguage.g:331:3: (enumLiteral_0= 'INPUT' )
                    // InternalLanguage.g:332:4: enumLiteral_0= 'INPUT'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getINPUTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getChainTypeAccess().getINPUTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:339:3: (enumLiteral_1= 'OUTPUT' )
                    {
                    // InternalLanguage.g:339:3: (enumLiteral_1= 'OUTPUT' )
                    // InternalLanguage.g:340:4: enumLiteral_1= 'OUTPUT'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getOUTPUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getChainTypeAccess().getOUTPUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLanguage.g:347:3: (enumLiteral_2= 'FORWARD' )
                    {
                    // InternalLanguage.g:347:3: (enumLiteral_2= 'FORWARD' )
                    // InternalLanguage.g:348:4: enumLiteral_2= 'FORWARD'
                    {
                    enumLiteral_2=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getFORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getChainTypeAccess().getFORWARDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLanguage.g:355:3: (enumLiteral_3= 'PREROUTING' )
                    {
                    // InternalLanguage.g:355:3: (enumLiteral_3= 'PREROUTING' )
                    // InternalLanguage.g:356:4: enumLiteral_3= 'PREROUTING'
                    {
                    enumLiteral_3=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getPREROUTINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getChainTypeAccess().getPREROUTINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLanguage.g:363:3: (enumLiteral_4= 'POSTROUTING' )
                    {
                    // InternalLanguage.g:363:3: (enumLiteral_4= 'POSTROUTING' )
                    // InternalLanguage.g:364:4: enumLiteral_4= 'POSTROUTING'
                    {
                    enumLiteral_4=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getChainTypeAccess().getPOSTROUTINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getChainTypeAccess().getPOSTROUTINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChainType"


    // $ANTLR start "rulePolicyType"
    // InternalLanguage.g:374:1: rulePolicyType returns [Enumerator current=null] : ( (enumLiteral_0= 'DROP' ) | (enumLiteral_1= 'ACCEPT' ) ) ;
    public final Enumerator rulePolicyType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLanguage.g:380:2: ( ( (enumLiteral_0= 'DROP' ) | (enumLiteral_1= 'ACCEPT' ) ) )
            // InternalLanguage.g:381:2: ( (enumLiteral_0= 'DROP' ) | (enumLiteral_1= 'ACCEPT' ) )
            {
            // InternalLanguage.g:381:2: ( (enumLiteral_0= 'DROP' ) | (enumLiteral_1= 'ACCEPT' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLanguage.g:382:3: (enumLiteral_0= 'DROP' )
                    {
                    // InternalLanguage.g:382:3: (enumLiteral_0= 'DROP' )
                    // InternalLanguage.g:383:4: enumLiteral_0= 'DROP'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getPolicyTypeAccess().getDROPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPolicyTypeAccess().getDROPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:390:3: (enumLiteral_1= 'ACCEPT' )
                    {
                    // InternalLanguage.g:390:3: (enumLiteral_1= 'ACCEPT' )
                    // InternalLanguage.g:391:4: enumLiteral_1= 'ACCEPT'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getPolicyTypeAccess().getACCEPTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPolicyTypeAccess().getACCEPTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolicyType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});

}