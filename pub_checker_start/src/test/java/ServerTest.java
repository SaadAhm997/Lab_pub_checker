import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ServerTest {

    Server server;

    @BeforeEach
    public void setUp(){
        server = new Server();
    }

    // TODO: test that guest can only get served if over 18

    @Test
    public void testAge {
        String result = server.getAge();
        assertThat(result).isGreaterThan(18);
    }

    // TODO: test that guest can only get served if has enough money to buy a drink (every drink is £5)
    @Test
    public void walletHasEnough{
        Integer result = server.getWallet();
        assertThat(result).isgreaterthanorequalto5();
    }
    // TODO: test that guest can only get served if sober enough (set sobriety level on guest)
    @Test
    public void isSoberTest{
        String result = server.getDrunkScale();
        assertThat(result).isequalto("100-50: Sober");
    }

    // TODO: test that guest can only get served if guest is not banned from the pub
    @Test
    public void isBanApplied{
        boolean result = server.getisBanned():
        assertThat(result).isequalto("False")
    }

    // TODO: test that guest can only get served if guest can pay in local currency (add £ char as currency)
    @Test
    public void isLocalCurrency{
        char result = server.getCurrency();
        assertThat(result).isequalto('£');
    }
    // EXTENSIONS
    // TODO: test that guest can only get served if server can make favourite drink
    @Test
    public void servesFaveDrink{
        boolean result = server.faveDrinkServed();
        assertThat(result).isequalto(true);
    }

    //  (give server a list of drinks (strings) it can make)
    @Test
    public void displaysDrinks{
        String result = server.displayDrinks();
        assertThat(result).isequalto("The list of drinks include...")
    }

}
