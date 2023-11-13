package metier;

import javax.xml.bind.annotation.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    // ... autres attributs

    @XmlTransient
    private Date dateCreation;

    // ... constructeurs, getters, setters
}
