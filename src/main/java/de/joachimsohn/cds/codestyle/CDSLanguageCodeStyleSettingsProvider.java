package de.joachimsohn.cds.codestyle;


import com.intellij.lang.Language;
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable;
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider;
import de.joachimsohn.cds.lang.CDSLanguage;
import org.jetbrains.annotations.NotNull;

public class CDSLanguageCodeStyleSettingsProvider extends LanguageCodeStyleSettingsProvider {

    @NotNull
    @Override
    public Language getLanguage() {
        return CDSLanguage.INSTANCE;
    }

    @Override
    public void customizeSettings(@NotNull CodeStyleSettingsCustomizable consumer, @NotNull SettingsType settingsType) {
        if (settingsType == SettingsType.SPACING_SETTINGS) {
            consumer.showStandardOptions("SPACE_WITHIN_BRACES");
            consumer.showStandardOptions("SPACE_WITHIN_BRACKETS");
            consumer.showStandardOptions("SPACE_WITHIN_PARENTHESES");
            consumer.showStandardOptions("SPACE_AFTER_COLON");
        }
    }

    @Override
    public String getCodeSample(@NotNull SettingsType settingsType) {
        return "namespace org.gicom.coursebooking;\n" +
                "\n" +
                "using {cuid, managed, User} from '@sap/cds/common';\n" +
                "\n" +
                "type Title : String(128) not null;\n" +
                "\n" +
                "type RegistrationStatus : String enum {accepted; denied; open; canceledByUser;};\n" +
                "type ParticipationStatus : String enum {accepted; denied; open;};\n" +
                "type Status : String enum {active; inactive;};\n" +
                "type CourseUnitType : String enum {meeting; assignment;};\n" +
                "\n" +
                "@assert.unique : {name : [name]}\n" +
                "@assert.unique : {email : [email]}\n" +
                "entity Users : cuid {\n" +
                "name : String(512) not null;\n" +
                "firstname : String(128) not null;\n" +
                "\n" +
                "lastname : String(128) not null;\n" +
                "\n" +
                "email : String(320) not null;\n" +
                "\n" +
                "roles : Association to many UserHasRole on roles.user = $self;\n" +
                "};";
    }

}
