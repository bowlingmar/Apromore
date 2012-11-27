package org.apromore.dao.model;

import org.apromore.graph.canonical.ObjectRefTypeEnum;
import org.springframework.beans.factory.annotation.Configurable;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * ObjectRef generated by hbm2java
 */
@Entity
@Table(name = "object_ref")
@Configurable("objectRef")
public class ObjectRef implements java.io.Serializable {

    private Integer id;
    private Boolean optional;
    private Boolean consumed;

    private ObjectRefTypeEnum type;

    private Node node;
    private Object object;
    private Set<ObjectRefAttribute> objectRefAttributes = new HashSet<ObjectRefAttribute>(0);

    /**
     * Public Constructor.
     */
    public ObjectRef() { }



    /**
     * returns the Id of this Object.
     * @return the id
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    /**
     * Sets the Id of this Object
     * @param id the new Id.
     */
    public void setId(final Integer id) {
        this.id = id;
    }


    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    public ObjectRefTypeEnum getType() {
        return this.type;
    }

    public void setType(ObjectRefTypeEnum type) {
        this.type = type;
    }


    @Column(name = "optional")
    public Boolean getOptional() {
        return this.optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }


    @Column(name = "consumed")
    public Boolean getConsumed() {
        return this.consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }


    @ManyToOne
    @JoinColumn(name = "nodeId")
    public Node getNode() {
        return this.node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    @ManyToOne
    @JoinColumn(name = "objectId")
    public Object getObject() {
        return this.object;
    }

    public void setObject(Object objectType) {
        this.object = objectType;
    }


    @OneToMany(mappedBy = "objectRef", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<ObjectRefAttribute> getObjectRefAttributes() {
        return this.objectRefAttributes;
    }

    public void setObjectRefAttributes(Set<ObjectRefAttribute> objectRefTypeAttributes) {
        this.objectRefAttributes = objectRefTypeAttributes;
    }

}

