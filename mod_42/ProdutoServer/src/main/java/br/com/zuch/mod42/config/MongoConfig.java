package br.com.zuch.mod42.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.cdgoes.mod42.repository")
public class MongoConfig {

}
