@XmlJavaTypeAdapters({
        @XmlJavaTypeAdapter(value = LocalDateTimeXmlAdapter.class, type = LocalDateTime.class)
})
package com.github.novotnyr.soap;

import io.github.threetenjaxb.core.LocalDateTimeXmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import java.time.LocalDateTime;