import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class QueryStringTest {

    @Test
    void shouldReturnStatusCode() {

        QueryString queryString = new QueryString("status=200");
        assertEquals("200" , queryString.getParameter("status"));
    }

    @Test
    void shouldReturnStatusCode_401() {

        QueryString queryString = new QueryString("status=401");
        assertEquals("401" , queryString.getParameter("status"));
    }

    @Test

    void shouldReturnNullForMissingParameters(){
        QueryString queryString = new QueryString("body=Hello");
        assertNull(queryString.getParameter("status"));

    }

    @Test

    void shouldSupportMultipleParameters(){

        QueryString queryString = new QueryString("status=200&body=Hello");
        assertEquals("200", queryString.getParameter("status"));
        assertEquals("Hello", queryString.getParameter("body"));
    }

}
