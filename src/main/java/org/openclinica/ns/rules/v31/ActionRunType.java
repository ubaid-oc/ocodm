//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.04.21 at 06:21:07 PM EDT 
//


package org.openclinica.ns.rules.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionRunType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionRunType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}ActionRunAttributeType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionRunType")
public class ActionRunType {

    @XmlAttribute(name = "AdministrativeDataEntry", required = true)
    protected boolean administrativeDataEntry;
    @XmlAttribute(name = "InitialDataEntry", required = true)
    protected boolean initialDataEntry;
    @XmlAttribute(name = "DoubleDataEntry", required = true)
    protected boolean doubleDataEntry;
    @XmlAttribute(name = "ImportDataEntry", required = true)
    protected boolean importDataEntry;
    @XmlAttribute(name = "Batch", required = true)
    protected boolean batch;

    /**
     * Gets the value of the administrativeDataEntry property.
     * 
     */
    public boolean isAdministrativeDataEntry() {
        return administrativeDataEntry;
    }

    /**
     * Sets the value of the administrativeDataEntry property.
     * 
     */
    public void setAdministrativeDataEntry(boolean value) {
        this.administrativeDataEntry = value;
    }

    /**
     * Gets the value of the initialDataEntry property.
     * 
     */
    public boolean isInitialDataEntry() {
        return initialDataEntry;
    }

    /**
     * Sets the value of the initialDataEntry property.
     * 
     */
    public void setInitialDataEntry(boolean value) {
        this.initialDataEntry = value;
    }

    /**
     * Gets the value of the doubleDataEntry property.
     * 
     */
    public boolean isDoubleDataEntry() {
        return doubleDataEntry;
    }

    /**
     * Sets the value of the doubleDataEntry property.
     * 
     */
    public void setDoubleDataEntry(boolean value) {
        this.doubleDataEntry = value;
    }

    /**
     * Gets the value of the importDataEntry property.
     * 
     */
    public boolean isImportDataEntry() {
        return importDataEntry;
    }

    /**
     * Sets the value of the importDataEntry property.
     * 
     */
    public void setImportDataEntry(boolean value) {
        this.importDataEntry = value;
    }

    /**
     * Gets the value of the batch property.
     * 
     */
    public boolean isBatch() {
        return batch;
    }

    /**
     * Sets the value of the batch property.
     * 
     */
    public void setBatch(boolean value) {
        this.batch = value;
    }

}
