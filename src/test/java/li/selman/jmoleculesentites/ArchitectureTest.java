package li.selman.jmoleculesentites;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesDddRules;

@AnalyzeClasses(packagesOf = App.class)
public class ArchitectureTest {

        @ArchTest
        ArchRule dddRules = JMoleculesDddRules.all();
}
