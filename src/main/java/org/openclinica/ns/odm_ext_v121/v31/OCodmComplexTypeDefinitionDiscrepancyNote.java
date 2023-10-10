//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.10 at 03:40:48 PM PKT 
//


package org.openclinica.ns.odm_ext_v121.v31;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OCodmComplexTypeDefinition-DiscrepancyNote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-DiscrepancyNote"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}ChildNote" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}DiscrepancyNoteElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}DiscrepancyNoteAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}DiscrepancyNoteAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-DiscrepancyNote", propOrder = {
    "childNote"
})
public class OCodmComplexTypeDefinitionDiscrepancyNote
    implements Serializable
{

    @XmlElement(name = "ChildNote")
    protected List<OCodmComplexTypeDefinitionChildNote> childNote;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "NoteType")
    protected String noteType;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "DateUpdated")
    protected XMLGregorianCalendar dateUpdated;
    @XmlAttribute(name = "NumberOfChildNotes")
    protected BigInteger numberOfChildNotes;

    /**
     * Gets the value of the childNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionChildNote }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionChildNote> getChildNote() {
        if (childNote == null) {
            childNote = new ArrayList<OCodmComplexTypeDefinitionChildNote>();
        }
        return this.childNote;
    }

    public boolean isSetChildNote() {
        return ((this.childNote!= null)&&(!this.childNote.isEmpty()));
    }

    public void unsetChildNote() {
        this.childNote = null;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    public boolean isSetID() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the noteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteType() {
        return noteType;
    }

    /**
     * Sets the value of the noteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteType(String value) {
        this.noteType = value;
    }

    public boolean isSetNoteType() {
        return (this.noteType!= null);
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    public boolean isSetStatus() {
        return (this.status!= null);
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdated(XMLGregorianCalendar value) {
        this.dateUpdated = value;
    }

    public boolean isSetDateUpdated() {
        return (this.dateUpdated!= null);
    }

    /**
     * Gets the value of the numberOfChildNotes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfChildNotes() {
        return numberOfChildNotes;
    }

    /**
     * Sets the value of the numberOfChildNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfChildNotes(BigInteger value) {
        this.numberOfChildNotes = value;
    }

    public boolean isSetNumberOfChildNotes() {
        return (this.numberOfChildNotes!= null);
    }

}
