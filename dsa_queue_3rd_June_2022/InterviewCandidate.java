package dsa_queue_3rd_June_2022;

public class InterviewCandidate implements Comparable<InterviewCandidate> {

	int id;
	String name;
	String source; // referral or non-referral

	@Override
	public int compareTo(InterviewCandidate o) {

		if (this.source.length() > o.source.length()) {
			return 1;
		} else if (this.source.length() < o.source.length()) {
			return -1;
		}

		else {
			return 0;
		}

	}

	public InterviewCandidate(int id, String name, String source) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
	}

	@Override
	public String toString() {
		return "InterviewCandidate [id=" + id + ", name=" + name + ", source=" + source + "]";
	}
}
