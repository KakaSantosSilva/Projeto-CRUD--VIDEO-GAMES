
package DAO;

import DTO.VideoGamesDTO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;


public class VideoGamesDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VideoGamesDTO> lista = new ArrayList<>();
    
    public void cadastrarVideoGames(VideoGamesDTO objvideogamesdto){
       
        String sql = "insert into Games(tipo_jogo,titulo_jogo,plataforma,midia,sinopse)values(?,?,?,?,?)";
        
        conn = new ConexaoDAO().ConectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objvideogamesdto.getTipo_jogo());
            pstm.setString(2, objvideogamesdto.getTitulo_jogo());
            pstm.setString(3, objvideogamesdto.getPlataforma());
            pstm.setString(4, objvideogamesdto.getMidia());
            pstm.setString(5, objvideogamesdto.getSinopse());
           
            
            
            pstm.execute();
            
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CADASTRAR VIDEO GAME"+erro);
        }
    }
    public ArrayList<VideoGamesDTO>PesquisarVideoGame(){
        String sql = "Select * from Games";
        
        conn = new ConexaoDAO().ConectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                VideoGamesDTO objvideogamesdto = new VideoGamesDTO();
                objvideogamesdto.setId_videogame(rs.getInt("id_videogame"));
                objvideogamesdto.setData_cadastro(rs.getString("dataCadastro"));
                objvideogamesdto.setTipo_jogo(rs.getString("tipo_jogo"));
                objvideogamesdto.setTitulo_jogo(rs.getString("titulo_jogo"));
                objvideogamesdto.setPlataforma(rs.getString("plataforma"));
                objvideogamesdto.setMidia(rs.getString("midia"));
                objvideogamesdto.setSinopse(rs.getString("sinopse"));
                objvideogamesdto.setStatus(rs.getString("statuss"));
                
                lista.add(objvideogamesdto);
         
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "VIDEOGAMES PESQUISAR"+erro);
        }
        return lista;
    }
    public void AlterarVideoGames(VideoGamesDTO objalterarvideogames ){
        
        String sql = "Update Games set tipo_jogo= ?, titulo_jogo = ?, plataforma = ?,midia = ?,sinopse = ? where id_videogame = ? ";
        
         conn = new ConexaoDAO().ConectaBD();
         
            try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objalterarvideogames.getTipo_jogo());
            pstm.setString(2, objalterarvideogames.getTitulo_jogo());
            pstm.setString(3, objalterarvideogames.getPlataforma());
            pstm.setString(4, objalterarvideogames.getMidia());
            pstm.setString(5, objalterarvideogames.getSinopse());
            pstm.setInt(6, objalterarvideogames.getId_videogame());
          
            pstm.execute();
            
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ALTERAR VIDEOGAME "+erro);
        }
       
    }
    public void ExcluirGame(VideoGamesDTO  objexcluirgame){
        String sql = "delete from Games where id_videogame = ?";
        
         conn = new ConexaoDAO().ConectaBD();
            try {
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, objexcluirgame.getId_videogame());
          
            pstm.execute();
            
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EXCLUIR VIDEOGAME "+erro);
        }
        
        
        
        
    }
}
