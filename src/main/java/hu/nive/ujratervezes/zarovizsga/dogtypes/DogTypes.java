package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes
{
    DataSource dataSource;

    public DogTypes(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country)
    {
        try (Connection conn = dataSource.getConnection())
        {
            try (PreparedStatement ps = conn.prepareStatement("SELECT NAME FROM dog_types WHERE country = ?")) {
                ps.setString(1,country.toUpperCase());
                ResultSet rs = ps.executeQuery();
                return listRs(rs);
            }
        }
        catch (SQLException sqle)
        {
            throw new IllegalStateException("Cannot connect: " + sqle.getMessage());
        }
    }

    public  List<String>  listRs(ResultSet rs) throws SQLException
    {
        List<String>  lista = new ArrayList<>();
        while(rs.next())
        {
            lista.add(rs.getString("name").toLowerCase());
        }
        return lista;
    }
}
