package manipulateaudiodata;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import android.util.Log;

public class WavFileReader {
      private static final String RIFF_HEADER = "RIFF";
	  private static final String WAVE_HEADER = "WAVE";
	  private static final String FMT_HEADER = "fmt ";
	  private static final String DATA_HEADER = "data";
	   
	  private static final int HEADER_SIZE = 44;
	   
	  private static final String CHARSET = "ASCII";
	 
	  public static int[] readHeader(InputStream wavStream)
			  throws IOException {
		  try{
			   	  int[] headerInfo = new int[5];
			      ByteBuffer buffer = ByteBuffer.allocate(HEADER_SIZE);
			      buffer.order(ByteOrder.LITTLE_ENDIAN);
			   
			      wavStream.read(buffer.array(), buffer.arrayOffset(), buffer.capacity());
			   
			      buffer.rewind();
			      buffer.position(buffer.position() + 20);
			      int format = buffer.getShort();
			      
			      //checkFormat(format == 1, "Unsupported encoding: " + format); // 1 means Linear PC
			      int channels = buffer.getShort();
			      
			      //checkFormat(channels == 1 || channels == 2, "Unsupported channels: " + channels);
			      int rate = buffer.getInt();
	
			      //checkFormat(rate <= 48000 && rate >= 11025, "Unsupported rate: " + rate);
			      buffer.position(buffer.position() + 6);
			      int bits = buffer.getShort();
	
			      //checkFormat(bits == 16, "Unsupported bits: " + bits);
			      int dataSize = 0;
			      while (buffer.getInt() != 0x61746164) { // "data" marker
			        //Log.d(TAG, "Skipping non-data chunk");
			        int size = buffer.getInt();
			        wavStream.skip(size);
			         
			        buffer.rewind();
			        wavStream.read(buffer.array(), buffer.arrayOffset(), 8);
			        buffer.rewind();
			        headerInfo[4]=size;
			      }
			      dataSize = buffer.getInt();

			      //checkFormat(dataSize > 0, "wrong datasize: " + dataSize);
			       headerInfo[0]=format;
			       headerInfo[1]=2;
			       headerInfo[2]=rate;
			       headerInfo[3]=bits;
			      // headerInfo[4]=dataSize;
		  
			      return headerInfo;
		  }catch(IOException e){throw e;}
		  
			    }
	public void checkFormat(int format, int channels, int rate, int bits, int dataSize)
	{
		if(format==1)
	      {
	    	  //unsupported encoding.
	      }
		if(channels==1 || channels ==2 )
	      {
	    	  //unsupported channels
	      }
	      if(rate<=48000 && rate >=11025)
	      {
	    	  //unsupported rate
	      }
	      if(bits==16)
	      {
	    	  //unsupported bits
	      }
	      if(dataSize > 0)
	      {
	    	  //wrong datasize
	      }
	}
}
