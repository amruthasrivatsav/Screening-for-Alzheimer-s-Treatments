
import java.io.IOException; import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringTokenizer;
public class SDFParser 
{
    public static void main(String[] args) throws IOException 
        {
            Path fileName = Path.of("SDFList.sdf"); String mols = Files.readString(fileName); String delim = "$$$$";
            String emptyLines = "\n\n\n\n";
            String head= "\n\n";
            StringTokenizer st = new StringTokenizer(mols,delim); String suffix = "_mol.sdf";
            int i = 0;
            while ( st.hasMoreTokens()){
                String mol = st.nextToken();
                mol = "\n\n"+mol; System.out.println(mol);
                String outFile = "output/"+i+suffix; Path outName = Path.of(outFile); Files.writeString(outName, mol);
                i++;
}
    System.out.println("totall mols = "+i);
} 
}