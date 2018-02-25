/**
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.tests;

import com.bmstu.iptables.xtext.language.Model;
import com.bmstu.iptables.xtext.tests.LanguageInjectorProvider;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(LanguageInjectorProvider.class)
@SuppressWarnings("all")
public class LanguageParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Chain INPUT (policy ACCEPT)");
      _builder.newLine();
      _builder.append("target prot opt source destination");
      _builder.newLine();
      _builder.append("ACCEPT \"Prot\" \"Opt\" !232.1.1.1/32,2.2.2.2/3 1.2.2.2/3,2.3.3.2/32");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
