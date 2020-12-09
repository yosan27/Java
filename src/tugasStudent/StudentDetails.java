package tugasStudent;

public interface StudentDetails {
//	Arrays of Object
	public String[][] semester1 = {
			  {"Pendidikan Pancasila", "2", "B1401", "Drs. Sulis, M.M."},
			  {"Pendidikan Kewarganegaraan", "2", "B1408", "Drs. Supendi, M.M."},
			  {"Bahasa Indonesia", "3", "B1105", "Dra. Siti Murni, M.M."},
			  {"Kalkulus 1", "4", "L301", "Amir Husein, M.Sc."},
			  {"Fisika Dasar", "6", "L409", "Johan Kuntowibowo, M.Sc."},
			  {"Dasar Sistem Komputer", "2", "L305", "Joni Fat, S.T., M.E., M.T."},};
	
	public String [][] semester2 = {
			  {"Pendidikan Agama", "2", "A1206", "Joni Fat, S.T., M.E., M.T."},
			  {"Kalkulus 2", "4", "L301", "Amir Husein, M.Sc."},
			  {"Kalkulus 3", "4", "L408", "Prof. Muljono"},
			  {"Bahasa Inggris", "2", "L408", "Drs. M. Ali Ghufron, M.Hum."},
			  {"Fisika Optik", "4", "L409", "Johan Kuntowibowo, M.Sc."},
			  {"Probabilitas & Statistik", "3", "L308", "Sigit Purnomo, M.Sc."}};
	
	public String [][] semester3 = {
			  {"Besaran Listrik", "3", "L408", "Herlianto Husada, S.T., M.T."},
			  {"Rangkaian Listrik", "4", "L301", "Dr. Ridwan Gunawan"},
			  {"Dasar Sistem Komunikasi", "4", "L402", "Dr. Endah Setyaningsih, M.T."},
			  {"Matematika Teknik 1", "3", "L409", "Prof. Muljono"},
			  {"Fisika Devais Semikonduktor", "2", "L411", "Johan Kuntowibowo, M.Sc."},
			  {"Dasar Elektronika", "3", "L305", "Suraidi, S.T., M.T."}};
	
	public String [][] semester4 = {
			  {"Sistem Linear", "4", "L301", "Dr. Ridwan Gunawan"},
			  {"Rangkaian Logika", "4", "L301", "Yohanes Calvinus, S.T., M.T."},
			  {"Keterampilan Komunikasi", "3", "L402", "Dr. Endah Setyaningsih, M.T."},
			  {"Matematika Teknik 2", "3", "L409", "Prof. Muljono"},
			  {"Dasar Tenaga Listrik", "2", "L411", "Herlianto Husada, S.T., M.T."},
			  {"Dasar Pemograman", "3", "L305", "Joni Fat, S.T., M.E., M.T."}};
	
	public String [][] semester5 = {
			  {"Dasar Sistem Kontrol", "4", "L301", "Dr. Ridwan Gunawan"},
			  {"Elektronika Digital", "4", "L408", "Yohanes Calvinus, S.T., M.T."},
			  {"Intelegensia Buatan", "3", "L403", "Meirista Wulandari, S.T., M.Eng."},
			  {"Matematika Teknik 3", "3", "L409", "Prof. Muljono"},
			  {"Kewirausahaan", "2", "L411", "Henry Chandra, S.T., M.T."},
			  {"Medan Elektromagnet", "3", "L305", "Johan Kuntowibowo, M.Sc."}};
	
	public String [][] semester6 = {
			  {"Komunikasi Data", "3", "L301", "Meirista Wulandari, S.T., M.Eng."},
			  {"Sistem Mikroprosesor", "4", "L406", "Joni Fat, S.T., M.E., M.T."},
			  {"Kepemimpinan", "2", "L402", "Meiske Yunithree, M.Psi."},
			  {"Sistem Pemrosesan Sinyal", "4", "L409", "Dr. Endah Setyaningsih, M.T."},
			  {"Teori Antrian", "3", "L411", "Henry Chandra, S.T., M.T."},
			  {"Elektronika Analog", "3", "L305", "Suraidi, S.T., M.T."}};
	
	public String [][] semester7 = {
			  {"Sistem Operasi", "3", "L301", "Dr. Eko Samsudin"},
			  {"Algoritma Struktur Data", "3", "Joni Fat, S.T., M.E., M.T."},
			  {"Teknik Antarmuka", "3", "L402", "Hadian Satria Utama, M.Eng."},
			  {"Metodologi Penelitian", "4", "L409", "Dr. Endah Setyaningsih, M.T."},
			  {"Arsitektur Komputer", "3", "L411", "Harlianto Tanudjaja, S.T., M.T."},
			  {"Hardware Desc. Language", "3", "L305", "Harlianto Tanudjaja, S.T., M.T."}};
	
	public String [][] semester8 = {
			  {"Kerja Praktek", "5", "-", "Harlianto Tanudjaja, S.T., M.T."},
			  {"Skripsi", "6", "-", "Dr. Wahidin Wahab"}};
	
//	Save All Coure into Array
	public String allCourse[][][] = {semester1, semester2, semester3, semester4, semester5, semester6, semester7, semester8};
	
//	Methods
	public void studentRegistration(String fullName, int cardId);
	public void learningPlan(int semester);

}
