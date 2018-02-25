package com.bmstu.iptables.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.bmstu.iptables.xtext.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_IP_ADDRESS", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INPUT'", "'OUTPUT'", "'FORWARD'", "'PREROUTING'", "'POSTROUTING'", "'DROP'", "'ACCEPT'", "'Chain'", "'('", "'policy'", "')'", "'target'", "'prot'", "'opt'", "'source'", "'destination'"
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

    	public void setGrammarAccess(LanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalLanguage.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalLanguage.g:54:1: ( ruleModel EOF )
            // InternalLanguage.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalLanguage.g:62:1: ruleModel : ( ( rule__Model__ChainsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:66:2: ( ( ( rule__Model__ChainsAssignment )* ) )
            // InternalLanguage.g:67:2: ( ( rule__Model__ChainsAssignment )* )
            {
            // InternalLanguage.g:67:2: ( ( rule__Model__ChainsAssignment )* )
            // InternalLanguage.g:68:3: ( rule__Model__ChainsAssignment )*
            {
             before(grammarAccess.getModelAccess().getChainsAssignment()); 
            // InternalLanguage.g:69:3: ( rule__Model__ChainsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLanguage.g:69:4: rule__Model__ChainsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ChainsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getChainsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleChain"
    // InternalLanguage.g:78:1: entryRuleChain : ruleChain EOF ;
    public final void entryRuleChain() throws RecognitionException {
        try {
            // InternalLanguage.g:79:1: ( ruleChain EOF )
            // InternalLanguage.g:80:1: ruleChain EOF
            {
             before(grammarAccess.getChainRule()); 
            pushFollow(FOLLOW_1);
            ruleChain();

            state._fsp--;

             after(grammarAccess.getChainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChain"


    // $ANTLR start "ruleChain"
    // InternalLanguage.g:87:1: ruleChain : ( ( rule__Chain__Group__0 ) ) ;
    public final void ruleChain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:91:2: ( ( ( rule__Chain__Group__0 ) ) )
            // InternalLanguage.g:92:2: ( ( rule__Chain__Group__0 ) )
            {
            // InternalLanguage.g:92:2: ( ( rule__Chain__Group__0 ) )
            // InternalLanguage.g:93:3: ( rule__Chain__Group__0 )
            {
             before(grammarAccess.getChainAccess().getGroup()); 
            // InternalLanguage.g:94:3: ( rule__Chain__Group__0 )
            // InternalLanguage.g:94:4: rule__Chain__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChain"


    // $ANTLR start "entryRuleChainPart"
    // InternalLanguage.g:103:1: entryRuleChainPart : ruleChainPart EOF ;
    public final void entryRuleChainPart() throws RecognitionException {
        try {
            // InternalLanguage.g:104:1: ( ruleChainPart EOF )
            // InternalLanguage.g:105:1: ruleChainPart EOF
            {
             before(grammarAccess.getChainPartRule()); 
            pushFollow(FOLLOW_1);
            ruleChainPart();

            state._fsp--;

             after(grammarAccess.getChainPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChainPart"


    // $ANTLR start "ruleChainPart"
    // InternalLanguage.g:112:1: ruleChainPart : ( ( rule__ChainPart__Group__0 ) ) ;
    public final void ruleChainPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:116:2: ( ( ( rule__ChainPart__Group__0 ) ) )
            // InternalLanguage.g:117:2: ( ( rule__ChainPart__Group__0 ) )
            {
            // InternalLanguage.g:117:2: ( ( rule__ChainPart__Group__0 ) )
            // InternalLanguage.g:118:3: ( rule__ChainPart__Group__0 )
            {
             before(grammarAccess.getChainPartAccess().getGroup()); 
            // InternalLanguage.g:119:3: ( rule__ChainPart__Group__0 )
            // InternalLanguage.g:119:4: rule__ChainPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChainPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChainPart"


    // $ANTLR start "ruleChainType"
    // InternalLanguage.g:128:1: ruleChainType : ( ( rule__ChainType__Alternatives ) ) ;
    public final void ruleChainType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:132:1: ( ( ( rule__ChainType__Alternatives ) ) )
            // InternalLanguage.g:133:2: ( ( rule__ChainType__Alternatives ) )
            {
            // InternalLanguage.g:133:2: ( ( rule__ChainType__Alternatives ) )
            // InternalLanguage.g:134:3: ( rule__ChainType__Alternatives )
            {
             before(grammarAccess.getChainTypeAccess().getAlternatives()); 
            // InternalLanguage.g:135:3: ( rule__ChainType__Alternatives )
            // InternalLanguage.g:135:4: rule__ChainType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ChainType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getChainTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChainType"


    // $ANTLR start "rulePolicyType"
    // InternalLanguage.g:144:1: rulePolicyType : ( ( rule__PolicyType__Alternatives ) ) ;
    public final void rulePolicyType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:148:1: ( ( ( rule__PolicyType__Alternatives ) ) )
            // InternalLanguage.g:149:2: ( ( rule__PolicyType__Alternatives ) )
            {
            // InternalLanguage.g:149:2: ( ( rule__PolicyType__Alternatives ) )
            // InternalLanguage.g:150:3: ( rule__PolicyType__Alternatives )
            {
             before(grammarAccess.getPolicyTypeAccess().getAlternatives()); 
            // InternalLanguage.g:151:3: ( rule__PolicyType__Alternatives )
            // InternalLanguage.g:151:4: rule__PolicyType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PolicyType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPolicyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolicyType"


    // $ANTLR start "rule__ChainType__Alternatives"
    // InternalLanguage.g:159:1: rule__ChainType__Alternatives : ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'FORWARD' ) ) | ( ( 'PREROUTING' ) ) | ( ( 'POSTROUTING' ) ) );
    public final void rule__ChainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:163:1: ( ( ( 'INPUT' ) ) | ( ( 'OUTPUT' ) ) | ( ( 'FORWARD' ) ) | ( ( 'PREROUTING' ) ) | ( ( 'POSTROUTING' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
                {
                alt2=3;
                }
                break;
            case 15:
                {
                alt2=4;
                }
                break;
            case 16:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLanguage.g:164:2: ( ( 'INPUT' ) )
                    {
                    // InternalLanguage.g:164:2: ( ( 'INPUT' ) )
                    // InternalLanguage.g:165:3: ( 'INPUT' )
                    {
                     before(grammarAccess.getChainTypeAccess().getINPUTEnumLiteralDeclaration_0()); 
                    // InternalLanguage.g:166:3: ( 'INPUT' )
                    // InternalLanguage.g:166:4: 'INPUT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getChainTypeAccess().getINPUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:170:2: ( ( 'OUTPUT' ) )
                    {
                    // InternalLanguage.g:170:2: ( ( 'OUTPUT' ) )
                    // InternalLanguage.g:171:3: ( 'OUTPUT' )
                    {
                     before(grammarAccess.getChainTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 
                    // InternalLanguage.g:172:3: ( 'OUTPUT' )
                    // InternalLanguage.g:172:4: 'OUTPUT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getChainTypeAccess().getOUTPUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLanguage.g:176:2: ( ( 'FORWARD' ) )
                    {
                    // InternalLanguage.g:176:2: ( ( 'FORWARD' ) )
                    // InternalLanguage.g:177:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getChainTypeAccess().getFORWARDEnumLiteralDeclaration_2()); 
                    // InternalLanguage.g:178:3: ( 'FORWARD' )
                    // InternalLanguage.g:178:4: 'FORWARD'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getChainTypeAccess().getFORWARDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLanguage.g:182:2: ( ( 'PREROUTING' ) )
                    {
                    // InternalLanguage.g:182:2: ( ( 'PREROUTING' ) )
                    // InternalLanguage.g:183:3: ( 'PREROUTING' )
                    {
                     before(grammarAccess.getChainTypeAccess().getPREROUTINGEnumLiteralDeclaration_3()); 
                    // InternalLanguage.g:184:3: ( 'PREROUTING' )
                    // InternalLanguage.g:184:4: 'PREROUTING'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getChainTypeAccess().getPREROUTINGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLanguage.g:188:2: ( ( 'POSTROUTING' ) )
                    {
                    // InternalLanguage.g:188:2: ( ( 'POSTROUTING' ) )
                    // InternalLanguage.g:189:3: ( 'POSTROUTING' )
                    {
                     before(grammarAccess.getChainTypeAccess().getPOSTROUTINGEnumLiteralDeclaration_4()); 
                    // InternalLanguage.g:190:3: ( 'POSTROUTING' )
                    // InternalLanguage.g:190:4: 'POSTROUTING'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getChainTypeAccess().getPOSTROUTINGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainType__Alternatives"


    // $ANTLR start "rule__PolicyType__Alternatives"
    // InternalLanguage.g:198:1: rule__PolicyType__Alternatives : ( ( ( 'DROP' ) ) | ( ( 'ACCEPT' ) ) );
    public final void rule__PolicyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:202:1: ( ( ( 'DROP' ) ) | ( ( 'ACCEPT' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLanguage.g:203:2: ( ( 'DROP' ) )
                    {
                    // InternalLanguage.g:203:2: ( ( 'DROP' ) )
                    // InternalLanguage.g:204:3: ( 'DROP' )
                    {
                     before(grammarAccess.getPolicyTypeAccess().getDROPEnumLiteralDeclaration_0()); 
                    // InternalLanguage.g:205:3: ( 'DROP' )
                    // InternalLanguage.g:205:4: 'DROP'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPolicyTypeAccess().getDROPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:209:2: ( ( 'ACCEPT' ) )
                    {
                    // InternalLanguage.g:209:2: ( ( 'ACCEPT' ) )
                    // InternalLanguage.g:210:3: ( 'ACCEPT' )
                    {
                     before(grammarAccess.getPolicyTypeAccess().getACCEPTEnumLiteralDeclaration_1()); 
                    // InternalLanguage.g:211:3: ( 'ACCEPT' )
                    // InternalLanguage.g:211:4: 'ACCEPT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPolicyTypeAccess().getACCEPTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PolicyType__Alternatives"


    // $ANTLR start "rule__Chain__Group__0"
    // InternalLanguage.g:219:1: rule__Chain__Group__0 : rule__Chain__Group__0__Impl rule__Chain__Group__1 ;
    public final void rule__Chain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:223:1: ( rule__Chain__Group__0__Impl rule__Chain__Group__1 )
            // InternalLanguage.g:224:2: rule__Chain__Group__0__Impl rule__Chain__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Chain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__0"


    // $ANTLR start "rule__Chain__Group__0__Impl"
    // InternalLanguage.g:231:1: rule__Chain__Group__0__Impl : ( 'Chain' ) ;
    public final void rule__Chain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:235:1: ( ( 'Chain' ) )
            // InternalLanguage.g:236:1: ( 'Chain' )
            {
            // InternalLanguage.g:236:1: ( 'Chain' )
            // InternalLanguage.g:237:2: 'Chain'
            {
             before(grammarAccess.getChainAccess().getChainKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getChainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__0__Impl"


    // $ANTLR start "rule__Chain__Group__1"
    // InternalLanguage.g:246:1: rule__Chain__Group__1 : rule__Chain__Group__1__Impl rule__Chain__Group__2 ;
    public final void rule__Chain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:250:1: ( rule__Chain__Group__1__Impl rule__Chain__Group__2 )
            // InternalLanguage.g:251:2: rule__Chain__Group__1__Impl rule__Chain__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Chain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__1"


    // $ANTLR start "rule__Chain__Group__1__Impl"
    // InternalLanguage.g:258:1: rule__Chain__Group__1__Impl : ( ( rule__Chain__ChainTypeAssignment_1 ) ) ;
    public final void rule__Chain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:262:1: ( ( ( rule__Chain__ChainTypeAssignment_1 ) ) )
            // InternalLanguage.g:263:1: ( ( rule__Chain__ChainTypeAssignment_1 ) )
            {
            // InternalLanguage.g:263:1: ( ( rule__Chain__ChainTypeAssignment_1 ) )
            // InternalLanguage.g:264:2: ( rule__Chain__ChainTypeAssignment_1 )
            {
             before(grammarAccess.getChainAccess().getChainTypeAssignment_1()); 
            // InternalLanguage.g:265:2: ( rule__Chain__ChainTypeAssignment_1 )
            // InternalLanguage.g:265:3: rule__Chain__ChainTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chain__ChainTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChainAccess().getChainTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__1__Impl"


    // $ANTLR start "rule__Chain__Group__2"
    // InternalLanguage.g:273:1: rule__Chain__Group__2 : rule__Chain__Group__2__Impl rule__Chain__Group__3 ;
    public final void rule__Chain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:277:1: ( rule__Chain__Group__2__Impl rule__Chain__Group__3 )
            // InternalLanguage.g:278:2: rule__Chain__Group__2__Impl rule__Chain__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Chain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__2"


    // $ANTLR start "rule__Chain__Group__2__Impl"
    // InternalLanguage.g:285:1: rule__Chain__Group__2__Impl : ( '(' ) ;
    public final void rule__Chain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:289:1: ( ( '(' ) )
            // InternalLanguage.g:290:1: ( '(' )
            {
            // InternalLanguage.g:290:1: ( '(' )
            // InternalLanguage.g:291:2: '('
            {
             before(grammarAccess.getChainAccess().getLeftParenthesisKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__2__Impl"


    // $ANTLR start "rule__Chain__Group__3"
    // InternalLanguage.g:300:1: rule__Chain__Group__3 : rule__Chain__Group__3__Impl rule__Chain__Group__4 ;
    public final void rule__Chain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:304:1: ( rule__Chain__Group__3__Impl rule__Chain__Group__4 )
            // InternalLanguage.g:305:2: rule__Chain__Group__3__Impl rule__Chain__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Chain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__3"


    // $ANTLR start "rule__Chain__Group__3__Impl"
    // InternalLanguage.g:312:1: rule__Chain__Group__3__Impl : ( 'policy' ) ;
    public final void rule__Chain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:316:1: ( ( 'policy' ) )
            // InternalLanguage.g:317:1: ( 'policy' )
            {
            // InternalLanguage.g:317:1: ( 'policy' )
            // InternalLanguage.g:318:2: 'policy'
            {
             before(grammarAccess.getChainAccess().getPolicyKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getPolicyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__3__Impl"


    // $ANTLR start "rule__Chain__Group__4"
    // InternalLanguage.g:327:1: rule__Chain__Group__4 : rule__Chain__Group__4__Impl rule__Chain__Group__5 ;
    public final void rule__Chain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:331:1: ( rule__Chain__Group__4__Impl rule__Chain__Group__5 )
            // InternalLanguage.g:332:2: rule__Chain__Group__4__Impl rule__Chain__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Chain__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__4"


    // $ANTLR start "rule__Chain__Group__4__Impl"
    // InternalLanguage.g:339:1: rule__Chain__Group__4__Impl : ( ( rule__Chain__PolicyTypeAssignment_4 ) ) ;
    public final void rule__Chain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:343:1: ( ( ( rule__Chain__PolicyTypeAssignment_4 ) ) )
            // InternalLanguage.g:344:1: ( ( rule__Chain__PolicyTypeAssignment_4 ) )
            {
            // InternalLanguage.g:344:1: ( ( rule__Chain__PolicyTypeAssignment_4 ) )
            // InternalLanguage.g:345:2: ( rule__Chain__PolicyTypeAssignment_4 )
            {
             before(grammarAccess.getChainAccess().getPolicyTypeAssignment_4()); 
            // InternalLanguage.g:346:2: ( rule__Chain__PolicyTypeAssignment_4 )
            // InternalLanguage.g:346:3: rule__Chain__PolicyTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Chain__PolicyTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChainAccess().getPolicyTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__4__Impl"


    // $ANTLR start "rule__Chain__Group__5"
    // InternalLanguage.g:354:1: rule__Chain__Group__5 : rule__Chain__Group__5__Impl rule__Chain__Group__6 ;
    public final void rule__Chain__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:358:1: ( rule__Chain__Group__5__Impl rule__Chain__Group__6 )
            // InternalLanguage.g:359:2: rule__Chain__Group__5__Impl rule__Chain__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Chain__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__5"


    // $ANTLR start "rule__Chain__Group__5__Impl"
    // InternalLanguage.g:366:1: rule__Chain__Group__5__Impl : ( ')' ) ;
    public final void rule__Chain__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:370:1: ( ( ')' ) )
            // InternalLanguage.g:371:1: ( ')' )
            {
            // InternalLanguage.g:371:1: ( ')' )
            // InternalLanguage.g:372:2: ')'
            {
             before(grammarAccess.getChainAccess().getRightParenthesisKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__5__Impl"


    // $ANTLR start "rule__Chain__Group__6"
    // InternalLanguage.g:381:1: rule__Chain__Group__6 : rule__Chain__Group__6__Impl rule__Chain__Group__7 ;
    public final void rule__Chain__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:385:1: ( rule__Chain__Group__6__Impl rule__Chain__Group__7 )
            // InternalLanguage.g:386:2: rule__Chain__Group__6__Impl rule__Chain__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Chain__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__6"


    // $ANTLR start "rule__Chain__Group__6__Impl"
    // InternalLanguage.g:393:1: rule__Chain__Group__6__Impl : ( 'target' ) ;
    public final void rule__Chain__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:397:1: ( ( 'target' ) )
            // InternalLanguage.g:398:1: ( 'target' )
            {
            // InternalLanguage.g:398:1: ( 'target' )
            // InternalLanguage.g:399:2: 'target'
            {
             before(grammarAccess.getChainAccess().getTargetKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getTargetKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__6__Impl"


    // $ANTLR start "rule__Chain__Group__7"
    // InternalLanguage.g:408:1: rule__Chain__Group__7 : rule__Chain__Group__7__Impl rule__Chain__Group__8 ;
    public final void rule__Chain__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:412:1: ( rule__Chain__Group__7__Impl rule__Chain__Group__8 )
            // InternalLanguage.g:413:2: rule__Chain__Group__7__Impl rule__Chain__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Chain__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__7"


    // $ANTLR start "rule__Chain__Group__7__Impl"
    // InternalLanguage.g:420:1: rule__Chain__Group__7__Impl : ( 'prot' ) ;
    public final void rule__Chain__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:424:1: ( ( 'prot' ) )
            // InternalLanguage.g:425:1: ( 'prot' )
            {
            // InternalLanguage.g:425:1: ( 'prot' )
            // InternalLanguage.g:426:2: 'prot'
            {
             before(grammarAccess.getChainAccess().getProtKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getProtKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__7__Impl"


    // $ANTLR start "rule__Chain__Group__8"
    // InternalLanguage.g:435:1: rule__Chain__Group__8 : rule__Chain__Group__8__Impl rule__Chain__Group__9 ;
    public final void rule__Chain__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:439:1: ( rule__Chain__Group__8__Impl rule__Chain__Group__9 )
            // InternalLanguage.g:440:2: rule__Chain__Group__8__Impl rule__Chain__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Chain__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__8"


    // $ANTLR start "rule__Chain__Group__8__Impl"
    // InternalLanguage.g:447:1: rule__Chain__Group__8__Impl : ( 'opt' ) ;
    public final void rule__Chain__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:451:1: ( ( 'opt' ) )
            // InternalLanguage.g:452:1: ( 'opt' )
            {
            // InternalLanguage.g:452:1: ( 'opt' )
            // InternalLanguage.g:453:2: 'opt'
            {
             before(grammarAccess.getChainAccess().getOptKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getOptKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__8__Impl"


    // $ANTLR start "rule__Chain__Group__9"
    // InternalLanguage.g:462:1: rule__Chain__Group__9 : rule__Chain__Group__9__Impl rule__Chain__Group__10 ;
    public final void rule__Chain__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:466:1: ( rule__Chain__Group__9__Impl rule__Chain__Group__10 )
            // InternalLanguage.g:467:2: rule__Chain__Group__9__Impl rule__Chain__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Chain__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__9"


    // $ANTLR start "rule__Chain__Group__9__Impl"
    // InternalLanguage.g:474:1: rule__Chain__Group__9__Impl : ( 'source' ) ;
    public final void rule__Chain__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:478:1: ( ( 'source' ) )
            // InternalLanguage.g:479:1: ( 'source' )
            {
            // InternalLanguage.g:479:1: ( 'source' )
            // InternalLanguage.g:480:2: 'source'
            {
             before(grammarAccess.getChainAccess().getSourceKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getSourceKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__9__Impl"


    // $ANTLR start "rule__Chain__Group__10"
    // InternalLanguage.g:489:1: rule__Chain__Group__10 : rule__Chain__Group__10__Impl rule__Chain__Group__11 ;
    public final void rule__Chain__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:493:1: ( rule__Chain__Group__10__Impl rule__Chain__Group__11 )
            // InternalLanguage.g:494:2: rule__Chain__Group__10__Impl rule__Chain__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Chain__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chain__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__10"


    // $ANTLR start "rule__Chain__Group__10__Impl"
    // InternalLanguage.g:501:1: rule__Chain__Group__10__Impl : ( 'destination' ) ;
    public final void rule__Chain__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:505:1: ( ( 'destination' ) )
            // InternalLanguage.g:506:1: ( 'destination' )
            {
            // InternalLanguage.g:506:1: ( 'destination' )
            // InternalLanguage.g:507:2: 'destination'
            {
             before(grammarAccess.getChainAccess().getDestinationKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getChainAccess().getDestinationKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__10__Impl"


    // $ANTLR start "rule__Chain__Group__11"
    // InternalLanguage.g:516:1: rule__Chain__Group__11 : rule__Chain__Group__11__Impl ;
    public final void rule__Chain__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:520:1: ( rule__Chain__Group__11__Impl )
            // InternalLanguage.g:521:2: rule__Chain__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chain__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__11"


    // $ANTLR start "rule__Chain__Group__11__Impl"
    // InternalLanguage.g:527:1: rule__Chain__Group__11__Impl : ( ( rule__Chain__PartsAssignment_11 )* ) ;
    public final void rule__Chain__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:531:1: ( ( ( rule__Chain__PartsAssignment_11 )* ) )
            // InternalLanguage.g:532:1: ( ( rule__Chain__PartsAssignment_11 )* )
            {
            // InternalLanguage.g:532:1: ( ( rule__Chain__PartsAssignment_11 )* )
            // InternalLanguage.g:533:2: ( rule__Chain__PartsAssignment_11 )*
            {
             before(grammarAccess.getChainAccess().getPartsAssignment_11()); 
            // InternalLanguage.g:534:2: ( rule__Chain__PartsAssignment_11 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLanguage.g:534:3: rule__Chain__PartsAssignment_11
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Chain__PartsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getChainAccess().getPartsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__Group__11__Impl"


    // $ANTLR start "rule__ChainPart__Group__0"
    // InternalLanguage.g:543:1: rule__ChainPart__Group__0 : rule__ChainPart__Group__0__Impl rule__ChainPart__Group__1 ;
    public final void rule__ChainPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:547:1: ( rule__ChainPart__Group__0__Impl rule__ChainPart__Group__1 )
            // InternalLanguage.g:548:2: rule__ChainPart__Group__0__Impl rule__ChainPart__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ChainPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChainPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__0"


    // $ANTLR start "rule__ChainPart__Group__0__Impl"
    // InternalLanguage.g:555:1: rule__ChainPart__Group__0__Impl : ( ( rule__ChainPart__TargetAssignment_0 ) ) ;
    public final void rule__ChainPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:559:1: ( ( ( rule__ChainPart__TargetAssignment_0 ) ) )
            // InternalLanguage.g:560:1: ( ( rule__ChainPart__TargetAssignment_0 ) )
            {
            // InternalLanguage.g:560:1: ( ( rule__ChainPart__TargetAssignment_0 ) )
            // InternalLanguage.g:561:2: ( rule__ChainPart__TargetAssignment_0 )
            {
             before(grammarAccess.getChainPartAccess().getTargetAssignment_0()); 
            // InternalLanguage.g:562:2: ( rule__ChainPart__TargetAssignment_0 )
            // InternalLanguage.g:562:3: rule__ChainPart__TargetAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__TargetAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChainPartAccess().getTargetAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__0__Impl"


    // $ANTLR start "rule__ChainPart__Group__1"
    // InternalLanguage.g:570:1: rule__ChainPart__Group__1 : rule__ChainPart__Group__1__Impl rule__ChainPart__Group__2 ;
    public final void rule__ChainPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:574:1: ( rule__ChainPart__Group__1__Impl rule__ChainPart__Group__2 )
            // InternalLanguage.g:575:2: rule__ChainPart__Group__1__Impl rule__ChainPart__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ChainPart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChainPart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__1"


    // $ANTLR start "rule__ChainPart__Group__1__Impl"
    // InternalLanguage.g:582:1: rule__ChainPart__Group__1__Impl : ( ( rule__ChainPart__ProtAssignment_1 ) ) ;
    public final void rule__ChainPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:586:1: ( ( ( rule__ChainPart__ProtAssignment_1 ) ) )
            // InternalLanguage.g:587:1: ( ( rule__ChainPart__ProtAssignment_1 ) )
            {
            // InternalLanguage.g:587:1: ( ( rule__ChainPart__ProtAssignment_1 ) )
            // InternalLanguage.g:588:2: ( rule__ChainPart__ProtAssignment_1 )
            {
             before(grammarAccess.getChainPartAccess().getProtAssignment_1()); 
            // InternalLanguage.g:589:2: ( rule__ChainPart__ProtAssignment_1 )
            // InternalLanguage.g:589:3: rule__ChainPart__ProtAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__ProtAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChainPartAccess().getProtAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__1__Impl"


    // $ANTLR start "rule__ChainPart__Group__2"
    // InternalLanguage.g:597:1: rule__ChainPart__Group__2 : rule__ChainPart__Group__2__Impl rule__ChainPart__Group__3 ;
    public final void rule__ChainPart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:601:1: ( rule__ChainPart__Group__2__Impl rule__ChainPart__Group__3 )
            // InternalLanguage.g:602:2: rule__ChainPart__Group__2__Impl rule__ChainPart__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ChainPart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChainPart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__2"


    // $ANTLR start "rule__ChainPart__Group__2__Impl"
    // InternalLanguage.g:609:1: rule__ChainPart__Group__2__Impl : ( ( rule__ChainPart__OptAssignment_2 ) ) ;
    public final void rule__ChainPart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:613:1: ( ( ( rule__ChainPart__OptAssignment_2 ) ) )
            // InternalLanguage.g:614:1: ( ( rule__ChainPart__OptAssignment_2 ) )
            {
            // InternalLanguage.g:614:1: ( ( rule__ChainPart__OptAssignment_2 ) )
            // InternalLanguage.g:615:2: ( rule__ChainPart__OptAssignment_2 )
            {
             before(grammarAccess.getChainPartAccess().getOptAssignment_2()); 
            // InternalLanguage.g:616:2: ( rule__ChainPart__OptAssignment_2 )
            // InternalLanguage.g:616:3: rule__ChainPart__OptAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__OptAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChainPartAccess().getOptAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__2__Impl"


    // $ANTLR start "rule__ChainPart__Group__3"
    // InternalLanguage.g:624:1: rule__ChainPart__Group__3 : rule__ChainPart__Group__3__Impl rule__ChainPart__Group__4 ;
    public final void rule__ChainPart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:628:1: ( rule__ChainPart__Group__3__Impl rule__ChainPart__Group__4 )
            // InternalLanguage.g:629:2: rule__ChainPart__Group__3__Impl rule__ChainPart__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ChainPart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ChainPart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__3"


    // $ANTLR start "rule__ChainPart__Group__3__Impl"
    // InternalLanguage.g:636:1: rule__ChainPart__Group__3__Impl : ( ( rule__ChainPart__SourceAssignment_3 ) ) ;
    public final void rule__ChainPart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:640:1: ( ( ( rule__ChainPart__SourceAssignment_3 ) ) )
            // InternalLanguage.g:641:1: ( ( rule__ChainPart__SourceAssignment_3 ) )
            {
            // InternalLanguage.g:641:1: ( ( rule__ChainPart__SourceAssignment_3 ) )
            // InternalLanguage.g:642:2: ( rule__ChainPart__SourceAssignment_3 )
            {
             before(grammarAccess.getChainPartAccess().getSourceAssignment_3()); 
            // InternalLanguage.g:643:2: ( rule__ChainPart__SourceAssignment_3 )
            // InternalLanguage.g:643:3: rule__ChainPart__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChainPartAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__3__Impl"


    // $ANTLR start "rule__ChainPart__Group__4"
    // InternalLanguage.g:651:1: rule__ChainPart__Group__4 : rule__ChainPart__Group__4__Impl ;
    public final void rule__ChainPart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:655:1: ( rule__ChainPart__Group__4__Impl )
            // InternalLanguage.g:656:2: rule__ChainPart__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__4"


    // $ANTLR start "rule__ChainPart__Group__4__Impl"
    // InternalLanguage.g:662:1: rule__ChainPart__Group__4__Impl : ( ( rule__ChainPart__DestinationAssignment_4 ) ) ;
    public final void rule__ChainPart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:666:1: ( ( ( rule__ChainPart__DestinationAssignment_4 ) ) )
            // InternalLanguage.g:667:1: ( ( rule__ChainPart__DestinationAssignment_4 ) )
            {
            // InternalLanguage.g:667:1: ( ( rule__ChainPart__DestinationAssignment_4 ) )
            // InternalLanguage.g:668:2: ( rule__ChainPart__DestinationAssignment_4 )
            {
             before(grammarAccess.getChainPartAccess().getDestinationAssignment_4()); 
            // InternalLanguage.g:669:2: ( rule__ChainPart__DestinationAssignment_4 )
            // InternalLanguage.g:669:3: rule__ChainPart__DestinationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ChainPart__DestinationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChainPartAccess().getDestinationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__Group__4__Impl"


    // $ANTLR start "rule__Model__ChainsAssignment"
    // InternalLanguage.g:678:1: rule__Model__ChainsAssignment : ( ruleChain ) ;
    public final void rule__Model__ChainsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:682:1: ( ( ruleChain ) )
            // InternalLanguage.g:683:2: ( ruleChain )
            {
            // InternalLanguage.g:683:2: ( ruleChain )
            // InternalLanguage.g:684:3: ruleChain
            {
             before(grammarAccess.getModelAccess().getChainsChainParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleChain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getChainsChainParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ChainsAssignment"


    // $ANTLR start "rule__Chain__ChainTypeAssignment_1"
    // InternalLanguage.g:693:1: rule__Chain__ChainTypeAssignment_1 : ( ruleChainType ) ;
    public final void rule__Chain__ChainTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:697:1: ( ( ruleChainType ) )
            // InternalLanguage.g:698:2: ( ruleChainType )
            {
            // InternalLanguage.g:698:2: ( ruleChainType )
            // InternalLanguage.g:699:3: ruleChainType
            {
             before(grammarAccess.getChainAccess().getChainTypeChainTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChainType();

            state._fsp--;

             after(grammarAccess.getChainAccess().getChainTypeChainTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__ChainTypeAssignment_1"


    // $ANTLR start "rule__Chain__PolicyTypeAssignment_4"
    // InternalLanguage.g:708:1: rule__Chain__PolicyTypeAssignment_4 : ( rulePolicyType ) ;
    public final void rule__Chain__PolicyTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:712:1: ( ( rulePolicyType ) )
            // InternalLanguage.g:713:2: ( rulePolicyType )
            {
            // InternalLanguage.g:713:2: ( rulePolicyType )
            // InternalLanguage.g:714:3: rulePolicyType
            {
             before(grammarAccess.getChainAccess().getPolicyTypePolicyTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePolicyType();

            state._fsp--;

             after(grammarAccess.getChainAccess().getPolicyTypePolicyTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__PolicyTypeAssignment_4"


    // $ANTLR start "rule__Chain__PartsAssignment_11"
    // InternalLanguage.g:723:1: rule__Chain__PartsAssignment_11 : ( ruleChainPart ) ;
    public final void rule__Chain__PartsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:727:1: ( ( ruleChainPart ) )
            // InternalLanguage.g:728:2: ( ruleChainPart )
            {
            // InternalLanguage.g:728:2: ( ruleChainPart )
            // InternalLanguage.g:729:3: ruleChainPart
            {
             before(grammarAccess.getChainAccess().getPartsChainPartParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleChainPart();

            state._fsp--;

             after(grammarAccess.getChainAccess().getPartsChainPartParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Chain__PartsAssignment_11"


    // $ANTLR start "rule__ChainPart__TargetAssignment_0"
    // InternalLanguage.g:738:1: rule__ChainPart__TargetAssignment_0 : ( rulePolicyType ) ;
    public final void rule__ChainPart__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:742:1: ( ( rulePolicyType ) )
            // InternalLanguage.g:743:2: ( rulePolicyType )
            {
            // InternalLanguage.g:743:2: ( rulePolicyType )
            // InternalLanguage.g:744:3: rulePolicyType
            {
             before(grammarAccess.getChainPartAccess().getTargetPolicyTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePolicyType();

            state._fsp--;

             after(grammarAccess.getChainPartAccess().getTargetPolicyTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__TargetAssignment_0"


    // $ANTLR start "rule__ChainPart__ProtAssignment_1"
    // InternalLanguage.g:753:1: rule__ChainPart__ProtAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ChainPart__ProtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:757:1: ( ( RULE_STRING ) )
            // InternalLanguage.g:758:2: ( RULE_STRING )
            {
            // InternalLanguage.g:758:2: ( RULE_STRING )
            // InternalLanguage.g:759:3: RULE_STRING
            {
             before(grammarAccess.getChainPartAccess().getProtSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChainPartAccess().getProtSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__ProtAssignment_1"


    // $ANTLR start "rule__ChainPart__OptAssignment_2"
    // InternalLanguage.g:768:1: rule__ChainPart__OptAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ChainPart__OptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:772:1: ( ( RULE_STRING ) )
            // InternalLanguage.g:773:2: ( RULE_STRING )
            {
            // InternalLanguage.g:773:2: ( RULE_STRING )
            // InternalLanguage.g:774:3: RULE_STRING
            {
             before(grammarAccess.getChainPartAccess().getOptSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getChainPartAccess().getOptSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__OptAssignment_2"


    // $ANTLR start "rule__ChainPart__SourceAssignment_3"
    // InternalLanguage.g:783:1: rule__ChainPart__SourceAssignment_3 : ( RULE_IP_ADDRESS ) ;
    public final void rule__ChainPart__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:787:1: ( ( RULE_IP_ADDRESS ) )
            // InternalLanguage.g:788:2: ( RULE_IP_ADDRESS )
            {
            // InternalLanguage.g:788:2: ( RULE_IP_ADDRESS )
            // InternalLanguage.g:789:3: RULE_IP_ADDRESS
            {
             before(grammarAccess.getChainPartAccess().getSourceIP_ADDRESSTerminalRuleCall_3_0()); 
            match(input,RULE_IP_ADDRESS,FOLLOW_2); 
             after(grammarAccess.getChainPartAccess().getSourceIP_ADDRESSTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__SourceAssignment_3"


    // $ANTLR start "rule__ChainPart__DestinationAssignment_4"
    // InternalLanguage.g:798:1: rule__ChainPart__DestinationAssignment_4 : ( RULE_IP_ADDRESS ) ;
    public final void rule__ChainPart__DestinationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLanguage.g:802:1: ( ( RULE_IP_ADDRESS ) )
            // InternalLanguage.g:803:2: ( RULE_IP_ADDRESS )
            {
            // InternalLanguage.g:803:2: ( RULE_IP_ADDRESS )
            // InternalLanguage.g:804:3: RULE_IP_ADDRESS
            {
             before(grammarAccess.getChainPartAccess().getDestinationIP_ADDRESSTerminalRuleCall_4_0()); 
            match(input,RULE_IP_ADDRESS,FOLLOW_2); 
             after(grammarAccess.getChainPartAccess().getDestinationIP_ADDRESSTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChainPart__DestinationAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});

}