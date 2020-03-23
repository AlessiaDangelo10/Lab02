package it.polito.tdp.alien.model;

public class Word {
String alienWord, italianWord;

public  Word ( String  alienWord , String  italianWord ) {
			super ();
			this.alienWord = alienWord;
		this.italianWord = italianWord;
		}

		public  String  getAlienWord () {
			return alienWord;
		}

		public  void  setAlienWord ( String  alienWord ) {
			this.alienWord = alienWord;
		}

		public  String  getItalianWord () {
			return italianWord;
		}

		public  void  setItalianWord ( String  italianWord ) {
			this.italianWord = italianWord;
		}

		@Override
		public String toString() {
			return " alienWord=" + alienWord + ", italianWord=" + italianWord + ";";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
			result = prime * result + ((italianWord == null) ? 0 : italianWord.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Word other = (Word) obj;
			if (alienWord == null) {
				if (other.alienWord != null)
					return false;
			} else if (!alienWord.equals(other.alienWord))
				return false;
			if (italianWord == null) {
				if (other.italianWord != null)
					return false;
			} else if (!italianWord.equals(other.italianWord))
				return false;
			return true;
		}

		

		
		
		

	

}
