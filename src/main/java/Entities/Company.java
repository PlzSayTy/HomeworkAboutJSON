package Entities;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Company
{
    private String ogrn;

    private Company_type company_type;

    private Country country;

    private String code;

    private String address;

    private String name_full;

    private String inn;

    private String fio_head;

    private List<Securities> securities;

    private String egrul_date;

    private String phone;

    private String e_mail;

    private String www;

    private String is_resident;

    private String id;

    private String name_short;

    public Company(String ogrn, Company_type company_type, Country country, String code, String address, String name_full, String inn, String fio_head, List<Securities> securities, String egrul_date, String phone, String e_mail, String www, String is_resident, String id, String name_short) {
        this.ogrn = ogrn;
        this.company_type = company_type;
        this.country = country;
        this.code = code;
        this.address = address;
        this.name_full = name_full;
        this.inn = inn;
        this.fio_head = fio_head;
        this.securities = securities;
        this.egrul_date = egrul_date;
        this.phone = phone;
        this.e_mail = e_mail;
        this.www = www;
        this.is_resident = is_resident;
        this.id = id;
        this.name_short = name_short;
    }

    public String getOgrn ()
    {
        return ogrn;
    }

    public void setOgrn (String ogrn)
    {
        this.ogrn = ogrn;
    }

    public Company_type getCompany_type ()
    {
        return company_type;
    }

    public void setCompany_type (Company_type company_type)
    {
        this.company_type = company_type;
    }

    public Country getCountry ()
    {
        return country;
    }

    public void setCountry (Country country)
    {
        this.country = country;
    }

    public String getCode ()
    {
        return code;
    }

    public void setCode (String code)
    {
        this.code = code;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getName_full ()
    {
        return name_full;
    }

    public void setName_full (String name_full)
    {
        this.name_full = name_full;
    }

    public String getInn ()
    {
        return inn;
    }

    public void setInn (String inn)
    {
        this.inn = inn;
    }

    public String getFio_head ()
    {
        return fio_head;
    }

    public void setFio_head (String fio_head)
    {
        this.fio_head = fio_head;
    }

    public List<Securities> getSecurities ()
    {
        return securities;
    }

    public void setSecurities (List<Securities> securities)
    {
        this.securities = securities;
    }

    public String getEgrul_date ()
    {
        return egrul_date;
    }

    public void setEgrul_date (String egrul_date)
    {
        this.egrul_date = egrul_date;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public String getE_mail ()
    {
        return e_mail;
    }

    public void setE_mail (String e_mail)
    {
        this.e_mail = e_mail;
    }

    public String getWww ()
    {
        return www;
    }

    public void setWww (String www)
    {
        this.www = www;
    }

    public String getIs_resident ()
    {
        return is_resident;
    }

    public void setIs_resident (String is_resident)
    {
        this.is_resident = is_resident;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName_short ()
    {
        return name_short;
    }

    public void setName_short (String name_short)
    {
        this.name_short = name_short;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ogrn = "+ogrn+", company_type = "+company_type+", country = "+country+", code = "+code+", address = "+address+", name_full = "+name_full+", inn = "+inn+", fio_head = "+fio_head+", securities = "+securities+", egrul_date = "+egrul_date+", phone = "+phone+", e_mail = "+e_mail+", www = "+www+", is_resident = "+is_resident+", id = "+id+", name_short = "+name_short+"]";
    }
}