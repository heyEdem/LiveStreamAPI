package jnrdev.edem.schedule.model;
import jnrdev.edem.schedule.model.MutableLiveStream;
import org.junit.jupiter.api.Test;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class LiveStreamTest {

    @Test
    void create_new_mutable_live_stream(){
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId(UUID.randomUUID().toString());
        stream.setTitle("Building REST APIs with spring boot");
        stream.setDescription("focus on building the future not fighting the past");

        stream.setUrl("https://www.twitch.tv/edemjnr");
        stream.setStartDate(LocalDateTime.of(2022,10,26,04,25));
        stream.setEndDate(LocalDateTime.of(2022,10,26,04,30));

        assertNotNull(stream);
        assertEquals("Building REST APIs with spring boot",stream.getTitle(),"ytht");
    }

    @Test
    void create_new_immutable_live_stream(){
        ImmutableLiveStream stream = new ImmutableLiveStream(
                UUID.randomUUID().toString(),
                "Building REST APIs with spring boot",
                "focus on building the future not fighting the past",
                "https://www.twitch.tv/edemjnr",
                LocalDateTime.of(2022,10,26,04,25),
                LocalDateTime.of(2022,10,26,04,30)
                );

        assertNotNull(stream);
        assertEquals("Building REST APIs with spring boot",stream.getTitle(),"ytht");

    }
    @Test
    void create_new_record_live_stream(){
        LiveStream stream = new LiveStream(UUID.randomUUID().toString(),
                "Building REST APIs with spring boot",
                "focus on building the future not fighting the past",
                "https://www.twitch.tv/edemjnr",
                LocalDateTime.of(2022,10,26,04,25),
                LocalDateTime.of(2022,10,26,04,30));


        assertNotNull(stream);
        assertEquals("Building REST APIs with spring boot",stream.title(),"ytht");
        assertTrue(stream.getClass().isRecord());
        assertEquals(6,stream.getClass().getRecordComponents().length);
    }
}
