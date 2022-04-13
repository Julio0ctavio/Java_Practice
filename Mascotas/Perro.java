package Mascotas;
//Librerías para entradas de usuario: (Con BufferedReader)
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

//Librerías para reproducir sonido:
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;




class Perro {

	//La clase Perro es un breve ejemplo de una mascota, ladra y además tiene diversos parámetros:

	String nombre, raza;
	int edad;
	char sexo;
	boolean vacuna;

	//Constructor por defecto:
	Perro(String nombre, String  raza, char sexo, int edad) throws IOException{
		this.nombre=nombre;
		this.raza=raza;
		this.sexo=sexo;
		this.edad=edad;
		
		
		System.out.println("Estos son los datos de " + nombre + ":\n");
		info_salud();

	}

	Perro(){
		String songpath="Perro.wav";
	    play(songpath);
	
	}

	void info_salud() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("¿Este perro posee todas sus vacunas? (y/n): \n");
		String texto;
		texto = br.readLine();
		if (texto.charAt(0) == 'y') {
			vacuna = true;
		}
		else {
			vacuna = false;
		}	
		System.out.println("\n\tCertificado de Vacunacion: " + vacuna 
				+ "\n\tNombre: " + nombre + "\n\tEdad: " 
				+ edad + " anios" + "\n\tSexo : '" + sexo + "'\n");

	}

	/* 
	 * Un hack para reproducir sonido
	 * Definiendo el tamaño del buffer:
	 * 
	 */

	void play(String filePath) {

		final File file = new File(filePath);

        try (final AudioInputStream in = getAudioInputStream(file)) {

            final AudioFormat outFormat = getOutFormat(in.getFormat());
            final Info info = new Info(SourceDataLine.class, outFormat);

            try (final SourceDataLine line =
                     (SourceDataLine) AudioSystem.getLine(info)) {

                if (line != null) {
                    line.open(outFormat);
                    line.start();
                    stream(getAudioInputStream(outFormat, in), line);
                    line.drain();
                    line.stop();
                }
            }

        } catch (UnsupportedAudioFileException 
               | LineUnavailableException 
               | IOException e) {
            throw new IllegalStateException(e);
        }
	}
	
	private AudioFormat getOutFormat(AudioFormat inFormat) {
        final int ch = inFormat.getChannels();

        final float rate = inFormat.getSampleRate();
        return new AudioFormat(PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }

    private void stream(AudioInputStream in, SourceDataLine line) 
        throws IOException {
        final byte[] buffer = new byte[4096];
        for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) {
            line.write(buffer, 0, n);
        }
    }

	public static void main(String[] args) throws IOException {
		Perro perro = new Perro("Luna Bella", "Boxer", 'H', 2);
		System.out.println("Hola " + perro.nombre + "!");
		new Perro();
	}

}
