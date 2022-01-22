package net.datafaker;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import net.datafaker.repeating.Repeat;
import org.junit.Test;

import java.util.Locale;

import static net.datafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneNumberTest extends AbstractFakerTest {

    @Test
    public void testCellPhone_enUS() {
        final Faker f = new Faker(Locale.US);
        assertThat(f.phoneNumber().cellPhone(), matchesRegularExpression("\\(?\\d+\\)?([- .]\\d+){1,3}"));
    }

    final Faker usfaker = new Faker(new Locale("en_US"));

    @Test
    @Repeat(times = 1000)
    public void testAllCellPhone_enUS() throws NumberParseException {
        String phoneNumber = usfaker.phoneNumber().phoneNumber();
        PhoneNumberUtil util = PhoneNumberUtil.getInstance();
        Phonenumber.PhoneNumber proto = util.parse(phoneNumber, "US");
        assertTrue(util.isValidNumberForRegion(proto, "US"));
    }

    @Test
    public void testPhone_esMx() {
        final Faker f = new Faker(new Locale("es_MX"));
        for (int i = 0; i < 100; i++) {
            assertThat(f.phoneNumber().cellPhone(), matchesRegularExpression("(044 )?\\(?\\d+\\)?([- .]\\d+){1,3}"));
            assertThat(f.phoneNumber().phoneNumber(), matchesRegularExpression("\\(?\\d+\\)?([- .]\\d+){1,3}"));
        }
    }

    @Test
    public void testPhone_CA() {
        final Locale[] locales = new Locale[]{Locale.CANADA, new Locale("ca")};
        for (Locale locale : locales) {
            final Faker f = new Faker(locale);
            final String canadianAreaCode = "403|587|780|825|236|250|604|672|778|204|431|506|"
                    + "709|782|902|226|249|289|343|365|416|437|519|548|613|647|705|807|905|367|"
                    + "418|438|450|514|579|581|819|873|306|639|867";
            for (int i = 0; i < 100; i++) {
                assertThat(f.phoneNumber().cellPhone(),
                        matchesRegularExpression(
                                String.format("((1-)?(\\(?(%s)\\)?)|(%s))[- .]\\d{3}[- .]\\d{4}",
                                        canadianAreaCode, canadianAreaCode)));
            }
        }
    }

    @Test
    public void testCellPhone() {
        assertThat(faker.phoneNumber().cellPhone(), matchesRegularExpression("\\(?\\d+\\)?([- .]\\d+){1,3}"));
    }

    @Test
    public void testPhoneNumber() {
        assertThat(faker.phoneNumber().phoneNumber(), matchesRegularExpression("\\(?\\d+\\)?([- .]x?\\d+){1,5}"));
    }

    @Test
    public void testExtension() {
        assertThat(faker.phoneNumber().extension(), matchesRegularExpression("\\d{4}"));
    }

    @Test
    public void testSubscriberNumber() {
        assertThat(faker.phoneNumber().subscriberNumber(), matchesRegularExpression("\\d{4}"));
    }

    @Test
    public void testSubscriberNumberWithLength() {
        assertThat(faker.phoneNumber().subscriberNumber(10), matchesRegularExpression("\\d{10}"));
    }
}
