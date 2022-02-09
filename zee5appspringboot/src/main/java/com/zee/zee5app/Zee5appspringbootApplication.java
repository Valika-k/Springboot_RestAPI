package com.zee.zee5app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.naming.NameNotFoundException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5app.dto.EROLE;
import com.zee.zee5app.dto.Episodes;
import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Role;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.AlreadyExistsException;
import com.zee.zee5app.exception.IdNotFoundException;
import com.zee.zee5app.exception.InvalidAmountException;
import com.zee.zee5app.exception.InvalidEmailException;
import com.zee.zee5app.exception.InvalidIdLengthException;
import com.zee.zee5app.exception.InvalidNameException;
import com.zee.zee5app.exception.InvalidPasswordException;
import com.zee.zee5app.repository.MovieRepository;
import com.zee.zee5app.repository.RoleRepository;
import com.zee.zee5app.repository.SeriesRepository;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.EpisodeService;
import com.zee.zee5app.service.LoginService;
import com.zee.zee5app.service.MovieService;
import com.zee.zee5app.service.RoleService;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.SubscriptionService;
import com.zee.zee5app.service.UserService;
import com.zee.zee5app.service.Impl.MovieServiceImpl;
import com.zee.zee5app.service.Impl.SeriesServiceImpl;
import com.zee.zee5app.service.Impl.SubscriptionServiceImpl;
import com.zee.zee5app.utils.FileUtils;

@SpringBootApplication
public class Zee5appspringbootApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Zee5appspringbootApplication.class,
				args);
	}
}




////package com.zee.zee5app;
////
////import java.math.BigDecimal;
////
////import org.springframework.boot.SpringApplication;
////import org.springframework.context.ApplicationContext;
////import org.springframework.context.ConfigurableApplicationContext;
////
////import com.zee.zee5app.dto.EROLE;
////import com.zee.zee5app.dto.Register;
////import com.zee.zee5app.dto.ROLE;
////import com.zee.zee5app.exception.AlreadyExistsException;
////import com.zee.zee5app.repository.MovieRepository;
////import com.zee.zee5app.repository.UserRepository;
////import com.zee.zee5app.service.RoleService;
////import com.zee.zee5app.service.UserService;
////
////public class Main {
////
////	
////	public static void main(String[] args) {
////
////		ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class,
////				args);
//////		Role role = new Role();
//////		role.setRoleName(EROLE.ROLE_ADMIN);
//////		
//////		Role role2 = new Role();
//////		role2.setRoleName(EROLE.ROLE_USER); 
////		
//////		RoleService roleService = applicationContext.getBean(RoleService.class);
//////		
//////		System.out.println(roleService.addRole(role));
//////		System.out.println(roleService.addRole(role2));
//////		ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class,args);
//////		
////		UserRepository repository =applicationContext.getBean(UserRepository.class);
////		UserService service =applicationContext.getBean(UserService.class);
////		Register register;
////		register = new Register("reg00013", "valika13", "kannaiah13", "valika13@gmail.com", "dghggfjbf", new BigDecimal("9434899989"), null);
////		register.setContactnumber(new BigDecimal("6767689184"));
////		try {
////			System.out.println(service.addUser(register));
////		} catch (AlreadyExistsException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		
////		System.out.println(repository.existsByEmailAndContactnumber("valika@gmail.com", new BigDecimal("3485784798")));
//////		
//////		
//////		MovieRepository movieRepository=applicationContext.getBean(MovieRepository.class);
//////		System.out.println(movieRepository.findByMovienameAndLanguage("robot 2","hindi"));
//////		System.out.println(movieRepository.findByMovienameAndReleaseDate("robot 2","2020-12-02"));
//////		System.out.println(movieRepository.findByCast("rajani"));
////		
////		
////		
////		//ApplicationContext applicationContext1 = Main;
////		
//////		System.out.println("\n\t\t\t\t\tTHIS IS FOR REGISTER\n");
//////		
//////		UserRepository userRepository  = applicationContext.getBean(UserRepository.class);
//////	
//////		UserService service = applicationContext.getBean(UserService.class);
//////		Register register;
//////		
//////		try {
//////		
//////			
//////			register = new Register("reg00020", "valika20", "kannaiah20", "valika20@gmail.com", "dnnfdm4", new BigDecimal("9434899989"), null);
//////			System.out.println(service.addUser(register));
//////		
//////	
//////		} catch (AlreadyExistsException e) {
//////			// TODO Auto-generated catch block
//////			e.printStackTrace();
//////		}
//////	
//////		System.out.println(userRepository.existsByEmailAndContactnumber("rh32@gmail.com", new BigDecimal("8631973123")));
////	
////		applicationContext.close();
////	}
////	
////}
//
//
//
//package com.zee.zee5app;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//import javax.naming.NameNotFoundException;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import com.zee.zee5app.dto.EROLE;
//import com.zee.zee5app.dto.Episodes;
//import com.zee.zee5app.dto.Movie;
//import com.zee.zee5app.dto.Role;
//import com.zee.zee5app.dto.Register;
//import com.zee.zee5app.dto.Series;
//import com.zee.zee5app.dto.Subscription;
//import com.zee.zee5app.exception.AlreadyExistsException;
//import com.zee.zee5app.exception.IdNotFoundException;
//import com.zee.zee5app.exception.InvalidAmountException;
//import com.zee.zee5app.exception.InvalidEmailException;
//import com.zee.zee5app.exception.InvalidIdLengthException;
//import com.zee.zee5app.exception.InvalidNameException;
//import com.zee.zee5app.exception.InvalidPasswordException;
//import com.zee.zee5app.repository.MovieRepository;
//import com.zee.zee5app.repository.RoleRepository;
//import com.zee.zee5app.repository.SeriesRepository;
//import com.zee.zee5app.repository.UserRepository;
//import com.zee.zee5app.service.EpisodeService;
//import com.zee.zee5app.service.LoginService;
//import com.zee.zee5app.service.MovieService;
//import com.zee.zee5app.service.RoleService;
//import com.zee.zee5app.service.SeriesService;
//import com.zee.zee5app.service.SubscriptionService;
//import com.zee.zee5app.service.UserService;
//import com.zee.zee5app.service.Impl.MovieServiceImpl;
//import com.zee.zee5app.service.Impl.SeriesServiceImpl;
//import com.zee.zee5app.service.Impl.SubscriptionServiceImpl;
//
//@SpringBootApplication
//public class Zee5appspringbootApplication {
//
//	public static void main(String[] args) throws AlreadyExistsException, InvalidAmountException {
//
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(Zee5appspringbootApplication.class,
//				args);
//		
//		
////		MovieService movieService = applicationContext.getBean(MovieService.class);
////		
////		Movie movie= new Movie();
////		movie.setId("mov0001");
////		movie.setAgeLimit("18");
////		movie.setCast("AA");
////		//movie.setReleaseDate("2022-01-01");
////		movie.setLanguage("telugu");
////		movie.setLength(250);
////		movie.setMovieName("pushpa");
////		movie.setGenre("abc");
////		FileInputStream fileInputStream=null;
////		try {
////		fileInputStream = new FileInputStream("C:\\Users\\Valika.k\\Downloads\\movies.mp4");
////		long fileSize = new File("C:\\Users\\Valika.k\\Downloads\\movies.mp4").length();
////		 byte[] allBytes = new byte[(int) fileSize];
////		 
////		 try {
////			fileInputStream.read(allBytes);
////			movie.setTrailer(allBytes);
////			
////			} catch (IOException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		}catch(FileNotFoundException e) {
////			e.printStackTrace();
////		}
////	
//		//movie.setTrailer(null);
////		Role role = new Role();
////		role.setRoleName(EROLE.ROLE_ADMIN);
////		
////		Role role2= new Role();
////		role2.setRoleName(EROLE.ROLE_USER);
////		
////		RoleService roleService= applicationContext.getBean(RoleService.class);
////		
////		RoleRepository roleRepository= applicationContext.getBean(RoleRepository.class);
//////		
////		System.out.println(roleService.addRole(role));
////		System.out.println(roleService.addRole(role2));
////		
////		UserRepository userrepository  = applicationContext.getBean(UserRepository.class);
////
////		UserService service = applicationContext.getBean(UserService.class);
////		Register register;
////		Register register1;
////		Register register2;
////		
////		
////		register = new Register("reg00021", "valika21", "kannaiah21", "valika21@gmail.com", "hdhbchbhd",new BigDecimal("3988495983") ,null);
//////		register = new Register("reg00021", "valika21", "kannaiah21", "valika21@gmail.com", "dccnsdd43", new BigDecimal("3988495983"), null);
////		register1 = new Register("reg00022", "valika22", "kannaiah22", "valika22@gmail.com", "aadnsdd43", new BigDecimal("8387495983"), null);
////		register2 = new Register("reg00023", "valika23", "kannaiah23", "valika23@gmail.com", "aadnsdd43", new BigDecimal("8387675983"), null);
//////		
////		Set<Role> roles = new HashSet<>();
////		roles.add(roleRepository.findById(1).get());
////		roles.add(roleRepository.findById(5).get());
////		register.setRoles(roles);
////		System.out.println(service.addUser(register));
////		System.out.println(service.addUser(register1));
////		System.out.println(service.addUser(register2));
////		
////		SeriesService seriesService =applicationContext.getBean(SeriesService.class);
////		EpisodeService episodeService = applicationContext.getBean(EpisodeService.class);
////		SubscriptionService subscriptionservice=  applicationContext.getBean(SubscriptionService.class);
////		Series series1 = new Series("show0001","13", "cast1","genre1","lang1", 20, "2021-01-01","seriesname1","trailer1", null);
////		Series series2 = new Series("show0002","13", "cast2","genre2","lang2", 20, "2021-01-01","seriesname2","trailer2", null);
////		System.out.println(seriesService.addSeries(series1));
////		System.out.println(seriesService.addSeries(series2));
//		
////		Series series1 = new Series("show001", "seriesname1","cast1","2021-01-01","trailer1","lang1","13","genre1","20");
////		Series series2 = new Series("show002", "seriesname2","cast2","2021-01-01","trailer2","lang2","13","genre2","20");
//		
////		Episodes episode = new Episodes("ep0001", "epiName1", 50, series2);
////		episodeService.addEpisode(episode);		
////		applicationContext.close();
//		
////		Subscription subs = new Subscription("subs001", "2020-01-02", 1499,"credit", "2020-02-02", "active", "monthly", "true", register2);
////		subscriptionservice.addSubscription(subs);		
//		//applicationContext.close();
//		
//		
//
//		}
//
//	}
//
//
//
//
//
//
//
//
//
//
//
//
////package com.zee.zee5app;
////
////import java.io.IOException;
////import java.math.BigDecimal;
////import java.util.List;
////import java.util.Optional;
////
////import javax.naming.NameNotFoundException;
////
////import org.springframework.boot.SpringApplication;
////import org.springframework.boot.autoconfigure.SpringBootApplication;
////import org.springframework.context.ConfigurableApplicationContext;
////
//////import com.zee.zee5app.dto.Episodes;
////import com.zee.zee5app.dto.Movie;
////import com.zee.zee5app.dto.Role;
////import com.zee.zee5app.dto.Register;
////import com.zee.zee5app.dto.Series;
////import com.zee.zee5app.dto.Subscription;
////import com.zee.zee5app.exception.IdNotFoundException;
////import com.zee.zee5app.exception.InvalidAmountException;
////import com.zee.zee5app.exception.InvalidEmailException;
////import com.zee.zee5app.exception.InvalidIdLengthException;
////import com.zee.zee5app.exception.InvalidNameException;
////import com.zee.zee5app.exception.InvalidPasswordException;
//////import com.zee.zee5app.service.EpisodeService;
////import com.zee.zee5app.service.LoginService;
////import com.zee.zee5app.service.MovieService;
////import com.zee.zee5app.service.SeriesService;
////import com.zee.zee5app.service.SubscriptionService;
////import com.zee.zee5app.service.UserService;
////import com.zee.zee5app.service.Impl.MovieServiceImpl;
////import com.zee.zee5app.service.Impl.SeriesServiceImpl;
////import com.zee.zee5app.service.Impl.SubscriptionServiceImpl;
////
////@SpringBootApplication
////public class Zee5appspringbootApplication {
////
////	public static void main(String[] args) {
////
////		ConfigurableApplicationContext applicationContext = SpringApplication.run(Zee5appspringbootApplication.class,
////				args);
////
////		// Registration details
////		
////		System.out.println("\nREGISTRATION DETAILS\n");
////
////		UserService service = applicationContext.getBean(UserService.class);
////		Register register;
////		
////		//Insert records
////		
////		register = new Register("reg0001", "valika", "kannaiah", "valika@gmail.com", "sjdnjdfj3u78", null);
////		register.setContactnumber(new BigDecimal("3485784798"));
////		System.out.println(service.addUser(register));
////		
////		register = new Register("reg0002", "valika1", "kannaiah1", "valika1@gmail.com", "dfmnf4u89", null);
////		register.setContactnumber(new BigDecimal("8487878484"));
////		System.out.println(service.addUser(register));
////		
////		register = new Register("reg0003", "valika2", "kannaiah2", "valika2@gmail.com", "fdjbhfbhb", null);
////		register.setContactnumber(new BigDecimal("9498475412"));
////		System.out.println(service.addUser(register));
////		
////		register = new Register("reg0004", "valika3", "kannaiah3", "valika3@gmail.com", "fnjjkfhfbhb", null);
////		register.setContactnumber(new BigDecimal("9445893412"));
////		System.out.println(service.addUser(register));
////		
////		register = new Register("reg0005", "valika4", "kannaiah4", "valika4@gmail.com", "ggjjkhfhfbhb", null);
////		register.setContactnumber(new BigDecimal("9447578812"));
////		System.out.println(service.addUser(register));
////		
////		register = new Register("reg0006", "valika5", "kannaiah5", "valika5@gmail.com", "sdksjhfbhb", null);
////		register.setContactnumber(new BigDecimal("9447547478"));
////		System.out.println(service.addUser(register));
////
////		Optional<Register> register1 = null;
////
////		try {
////			register1 = service.getUserById("reg0004");
////			if (register1 != null) {
////				System.out.println("Record found");
////				System.out.println(register1.get());
////			} else {
////				System.out.println("record not found");
////			}
////		} catch (IdNotFoundException | InvalidIdLengthException | InvalidEmailException | InvalidPasswordException
////				| InvalidNameException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////		
////		//Get all user details
////		
////		Optional<List<Register>> optional1;
////		try {
////			optional1 = service.getAllUserDetails();
////			if (optional1.isEmpty()) {
////				System.out.println("no records");
////			} else {
////				optional1.get().forEach(e -> System.out.println(e));
////			}
////		} catch (InvalidIdLengthException | InvalidNameException | InvalidEmailException
////				| InvalidPasswordException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		
////		try {
////			for (Register register2 : service.getAllUsers()) {
////				if (register2 != null)
////					System.out.println(register2);
////			}
////		} catch (InvalidIdLengthException | InvalidNameException | InvalidEmailException
////				| InvalidPasswordException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		
////		//Delete user details by id
////
////		try {
////			service.deleteUserById("reg0003");
////		} catch (IdNotFoundException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		
////		
////
////		//Movie details
////
////		System.out.println("\n MOVIE DETAILS\n");
////
////		MovieService service3 = applicationContext.getBean(MovieService.class);
////		Movie movie;
////
////		
////		//Insert records
////		
////		movie = new Movie("m00001", "Robot 1", "rajani", 150, "2020-12-01", null, "telugu", "13", "action");
////		String result13 = service3.addMovie(movie);
////		System.out.println(result13);
////
////		movie = new Movie("m00002", "robot 2", "rajani", 134, "2020-12-02", null, "hindi", "13",
////				"tamil");
////		String result5 = service3.addMovie(movie);
////		System.out.println(result5);
////
////		movie = new Movie("m00003", "eternals", "xyzhdjh", 121, "2021-12-01", null, "english", "12", "superhero");
////		String result6 = service3.addMovie(movie);
////		System.out.println(result6);
////
////		Optional<Movie> movie1 = null;
////
////		try {
////			movie1 = service3.getMovieById("m00001");
////			System.out.println(movie1.get());
////		} catch (NameNotFoundException | IdNotFoundException | InvalidIdLengthException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////		
////		//Display all movies
////
////		Optional<List<Movie>> optional2;
////		try {
////			optional2 = service3.getAllMovies();
////			if (optional2.isEmpty()) {
////				System.out.println("no records");
////			} else {
////				optional2.get().forEach(e -> System.out.println(e));
////			}
////		} catch (NameNotFoundException | InvalidIdLengthException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		
////
////		Optional<List<Movie>> optional3;
////		try {
////			optional3 = service3.getAllMovies();
////			if (optional3.isEmpty()) {
////				System.out.println("there are no records");
////			} else {
////				optional3.get().forEach(e -> System.out.println(e));
////			}
////		} catch (NameNotFoundException | InvalidIdLengthException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		
////		//delete movie
////		
////		try {
////			service3.deleteMovie("m00003");
////		} catch (IdNotFoundException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////		
////		
////		
////		//Series details
////
////		System.out.println("\n SERIES DETAILS\n");
////
////		SeriesService service4 = applicationContext.getBean(SeriesService.class);
////		Series series;
////
////		series = new Series("show0001", "Stranger things", "vgdhgsh", "2018-01-01", null, "english", "13", "thriller", 36);
////		String result1 = service4.addSeries(series);
////		System.out.println(result1);
////
////		series = new Series("show0002", "friends", "ross,joey", "1996-02-01", null, "english", "13", "sitcom",
////				56);
////		String result7 = service4.addSeries(series);
////		System.out.println(result7);
////
////		series = new Series("show0003", "the office", "michael scott", "2005-02-01", null, "english", "18", "sitcom",
////				90);
////		String result8 = service4.addSeries(series);
////		System.out.println(result8);
////
////		Optional<Series> series1 = null;
////
////		try {
////			series1 = service4.getSeriesById("show0001");
////			System.out.println(series1.get());
////		} catch (NameNotFoundException | IdNotFoundException | InvalidIdLengthException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////		
////		//get all series
////		
////		Optional<List<Series>> optional4;
////		try {
////			optional4 = service4.getAllSeries();
////			if (optional4.isEmpty()) {
////				System.out.println("there are no records");
////			} else {
////				optional4.get().forEach(e -> System.out.println(e));
////			}
////		} catch (InvalidIdLengthException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		
////		
////
////		Optional<List<Series>> optional5;
////		try {
////			optional5 = service4.getAllSeries();
////			if (optional5.isEmpty()) {
////				System.out.println("there are no records");
////			} else {
////				optional5.get().forEach(e -> System.out.println(e));
////			}
////
////		} catch (InvalidIdLengthException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////		//Delete series
////
////		try {
////			service4.deleteSeriesById("show0003");
////		} catch (IdNotFoundException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		try {
////			service4.deleteSeriesById("show0003");
////		} catch (IdNotFoundException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////		System.out.println("\n SUBSCRIPTION DETAILS\n");
////
////		SubscriptionService service2 = applicationContext.getBean(SubscriptionService.class);
////		Subscription subscription;
////
////		
////		try {
////			subscription = new Subscription("s0001", "2021-01-01", 4599.0f, "credit", "2020-01-01", "active", "annual",
////					"false", "reg0001");
////			String result= service2.addSubscription(subscription);
////			System.out.println(result);
////			
////			subscription = new Subscription("s0002", "2020-04-13", 2999.0f, "dedit", "2020-07-13", "active", "quaterly",
////					"true", "reg0004");
////			String result3 = service2.addSubscription(subscription);
////			System.out.println(result3);
////
////			subscription = new Subscription("s0003", "2020-06-01", 1499.0f, "netbanking", "2020-07-01", "inactive",
////					"monthly", "false", "reg0005");
////			String result4 = service2.addSubscription(subscription);
////			System.out.println(result4);
////		} catch (InvalidAmountException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////		Optional<Subscription> subscription1 = null;
////
////		try {
////			subscription1 = service2.getSubscriptionById("s0001");
////			System.out.println(subscription1.get());
////		} catch (IdNotFoundException | InvalidIdLengthException | InvalidAmountException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////		
////
////		Optional<List<Subscription>> optional;
////		try {
////			optional = service2.getAllSubscriptions();
////			if (optional.isEmpty()) {
////				System.out.println("there are no records");
////			} else {
////				optional.get().forEach(e -> System.out.println(e));
////			}
////		} catch (InvalidIdLengthException | InvalidAmountException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
//////
//////		
//////
////		try {
////			service2.deleteSubscription("s0003");
////		} catch (IdNotFoundException e2) {
////			// TODO Auto-generated catch block
////			e2.printStackTrace();
////		}
////
////
////		
////		applicationContext.close();
////
////	}
////
////}