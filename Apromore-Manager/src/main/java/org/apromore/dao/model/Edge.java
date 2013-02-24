package org.apromore.dao.model;

import org.springframework.beans.factory.annotation.Configurable;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Edge generated by hbm2java
 */
@Entity
@Table(name = "edge",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"uri"})
        }
)
@Cacheable(true)
@Configurable("edge")
public class Edge implements Serializable {

    private Integer id;
    private String uri;
    private String originalId;
    private Boolean def = false;

    private Content content;
    private Expression conditionExpression;

    private Node sourceNode;
    private Node targetNode;
    private Node cancelNode;

    private Set<EdgeAttribute> attributes = new HashSet<EdgeAttribute>(0);

    /**
     * Public Constructor.
     */
    public Edge() { }



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



    @Column(name = "uri", length = 40)
    public String getUri() {
        return this.uri;
    }

    public void setUri(final String newUri) {
        this.uri = newUri;
    }

    @Column(name = "originalId", length = 200)
    public String getOriginalId() {
        return this.originalId;
    }

    public void setOriginalId(final String newOriginalId) {
        this.originalId = newOriginalId;
    }

    @Column(name = "def", length = 1)
    public Boolean getDef() {
        return this.def;
    }

    public void setDef(final Boolean newDefault) {
        this.def = newDefault;
    }



    @ManyToOne
    @JoinColumn(name = "contentId")
    public Content getContent() {
        return this.content;
    }

    public void setContent(final Content newContent) {
        this.content = newContent;
    }

    @ManyToOne
    @JoinColumn(name = "conditionExpressionId")
    public Expression getConditionExpression() {
        return this.conditionExpression;
    }

    public void setConditionExpression(final Expression newConditionExpression) {
        this.conditionExpression = newConditionExpression;
    }

    @ManyToOne
    @JoinColumn(name = "sourceNodeId")
    public Node getSourceNode() {
        return this.sourceNode;
    }

    public void setSourceNode(final Node newSourceNode) {
        this.sourceNode = newSourceNode;
    }

    @ManyToOne
    @JoinColumn(name = "targetNodeId")
    public Node getTargetNode() {
        return this.targetNode;
    }

    public void setTargetNode(final Node newTargetNode) {
        this.targetNode = newTargetNode;
    }

    @ManyToOne
    @JoinColumn(name = "cancelNodeId")
    public Node getCancelNode() {
        return this.cancelNode;
    }

    public void setCancelNode(final Node newCancelNode) {
        this.cancelNode = newCancelNode;
    }



    @OneToMany(mappedBy = "edge", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<EdgeAttribute> getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Set<EdgeAttribute> newAttributes) {
        this.attributes = newAttributes;
    }

}


