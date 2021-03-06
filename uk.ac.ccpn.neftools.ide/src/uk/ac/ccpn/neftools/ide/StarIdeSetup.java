/*
 * generated by Xtext 2.21.0
 */
package uk.ac.ccpn.neftools.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import uk.ac.ccpn.neftools.StarRuntimeModule;
import uk.ac.ccpn.neftools.StarStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class StarIdeSetup extends StarStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new StarRuntimeModule(), new StarIdeModule()));
	}
	
}
