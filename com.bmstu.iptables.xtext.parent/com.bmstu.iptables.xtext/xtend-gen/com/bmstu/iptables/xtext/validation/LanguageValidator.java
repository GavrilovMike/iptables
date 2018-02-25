/**
 * generated by Xtext 2.12.0
 */
package com.bmstu.iptables.xtext.validation;

import com.bmstu.iptables.xtext.language.ChainPart;
import com.bmstu.iptables.xtext.language.LanguagePackage;
import com.bmstu.iptables.xtext.validation.AbstractLanguageValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LanguageValidator extends AbstractLanguageValidator {
  @Check
  public void checkChainParts(final ChainPart part) {
    this.checkIpAddress(part.getSource(), LanguagePackage.Literals.CHAIN_PART__SOURCE);
    this.checkIpAddress(part.getDestination(), LanguagePackage.Literals.CHAIN_PART__DESTINATION);
  }
  
  public void checkIpAddress(final String ipAddress, final EStructuralFeature feature) {
    List<String> addressParts = this.removeEmptyParts(ipAddress.split("\\D"));
    boolean _isEmpty = addressParts.isEmpty();
    if (_isEmpty) {
      return;
    }
    for (final String addressPart : addressParts) {
      Integer _valueOf = Integer.valueOf(addressPart);
      boolean _greaterThan = ((_valueOf).intValue() > 255);
      if (_greaterThan) {
        this.error("Address part should be in range 0..255", feature);
      }
    }
    {
      int partIndex = 4;
      int _size = addressParts.size();
      boolean _lessThan = (partIndex < _size);
      boolean _while = _lessThan;
      while (_while) {
        Integer _valueOf_1 = Integer.valueOf(addressParts.get(partIndex));
        boolean _greaterThan_1 = ((_valueOf_1).intValue() > 32);
        if (_greaterThan_1) {
          this.error("Address mask should be in range 0..32", feature);
        }
        int _partIndex = partIndex;
        partIndex = (_partIndex + 5);
        int _size_1 = addressParts.size();
        boolean _lessThan_1 = (partIndex < _size_1);
        _while = _lessThan_1;
      }
    }
  }
  
  public List<String> removeEmptyParts(final String[] strings) {
    ArrayList<String> result = new ArrayList<String>();
    for (final String string : strings) {
      boolean _isEmpty = string.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        result.add(string);
      }
    }
    return result;
  }
}
