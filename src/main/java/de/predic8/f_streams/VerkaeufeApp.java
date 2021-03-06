package de.predic8.f_streams;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Printed;

import java.util.Properties;

import static org.apache.kafka.streams.StreamsConfig.APPLICATION_ID_CONFIG;
import static org.apache.kafka.streams.StreamsConfig.BOOTSTRAP_SERVERS_CONFIG;

public class VerkaeufeApp {

    public static void main(String[] args) throws InterruptedException {

        Properties props = new Properties();
        props.put( APPLICATION_ID_CONFIG, "verkaeufe");
        props.put( BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");

        StreamsBuilder builder = new StreamsBuilder();

        KStream<Long, Verkauf> src = builder.stream("verkaeufe",
                Consumed.with( Serdes.Long(),
                        new VerkaufSerde()));

        src.print(Printed.toSysOut());


        KafkaStreams streams = new KafkaStreams(builder.build(), props);

        streams.start();

    }
}
