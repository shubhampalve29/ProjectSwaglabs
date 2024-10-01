package com.example.utils;

import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.Map;

public class YamlReader {
    public static Map<String, Map<String, String>> readYaml(String filePath) {
        Yaml yaml = new Yaml();
        InputStream inputStream = YamlReader.class.getClassLoader().getResourceAsStream(filePath);
        return yaml.load(inputStream);
    }
}