package ChainOfResponsability.process.steps;

import ChainOfResponsability.process.service.ProcessContext;

public abstract class StepProcess {
    protected StepProcess next;
    protected Object[] args;

    public StepProcess(Object... args) {
        this.args = args;
    }

    public abstract ProcessContext execute(ProcessContext context) throws Exception;

    public void setNextStep(StepProcess next) {
        this.next = next;
    }

    protected ProcessContext nextStep(ProcessContext context, Object actual) throws Exception {
        context.addProcessResult(actual);
        return this.next != null ? this.next.execute(context) : context;
    }

}
