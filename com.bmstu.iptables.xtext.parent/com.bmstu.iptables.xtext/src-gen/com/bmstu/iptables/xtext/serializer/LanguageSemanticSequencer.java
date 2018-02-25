/*
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.serializer;

import com.bmstu.iptables.xtext.language.Chain;
import com.bmstu.iptables.xtext.language.ChainPart;
import com.bmstu.iptables.xtext.language.LanguagePackage;
import com.bmstu.iptables.xtext.language.Model;
import com.bmstu.iptables.xtext.services.LanguageGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LanguagePackage.CHAIN:
				sequence_Chain(context, (Chain) semanticObject); 
				return; 
			case LanguagePackage.CHAIN_PART:
				sequence_ChainPart(context, (ChainPart) semanticObject); 
				return; 
			case LanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ChainPart returns ChainPart
	 *
	 * Constraint:
	 *     (target=PolicyType prot=STRING opt=STRING source=IP_ADDRESS destination=IP_ADDRESS)
	 */
	protected void sequence_ChainPart(ISerializationContext context, ChainPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.CHAIN_PART__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.CHAIN_PART__TARGET));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.CHAIN_PART__PROT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.CHAIN_PART__PROT));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.CHAIN_PART__OPT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.CHAIN_PART__OPT));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.CHAIN_PART__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.CHAIN_PART__SOURCE));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.CHAIN_PART__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.CHAIN_PART__DESTINATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChainPartAccess().getTargetPolicyTypeEnumRuleCall_0_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getChainPartAccess().getProtSTRINGTerminalRuleCall_1_0(), semanticObject.getProt());
		feeder.accept(grammarAccess.getChainPartAccess().getOptSTRINGTerminalRuleCall_2_0(), semanticObject.getOpt());
		feeder.accept(grammarAccess.getChainPartAccess().getSourceIP_ADDRESSTerminalRuleCall_3_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getChainPartAccess().getDestinationIP_ADDRESSTerminalRuleCall_4_0(), semanticObject.getDestination());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Chain returns Chain
	 *
	 * Constraint:
	 *     (chainType=ChainType policyType=PolicyType parts+=ChainPart*)
	 */
	protected void sequence_Chain(ISerializationContext context, Chain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     chains+=Chain+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
